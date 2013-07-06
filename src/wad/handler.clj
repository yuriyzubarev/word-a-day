(ns wad.handler
  (:use compojure.core
        wad.views)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.adapter.jetty :as ring]
            [clojure.java.jdbc :as sql]
            [taoensso.timbre :as timbre
              :refer (trace debug info warn error fatal spy)]))

(defn -db-url []
  (let [sys-db-url (System/getenv "DATABASE_URL")]
    (debug (str "sys-db-url = " sys-db-url))
    sys-db-url))

(defroutes app-routes
  (GET "/" []
    (do
      (sql/with-connection (-db-url)
        (sql/with-query-results results
          ["select * from slides"]
          (db-page (into [] results))))))
  (POST "/" [title]
    (sql/with-connection (-db-url)
      (sql/insert-values :slides [:title] [title])))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(defn start [port]
  (ring/run-jetty (var app)
    	  {:port (or port 8080) :join? false}))

(defn -main
  ([] (-main 8080))
  ([port]
     (let [sys-port (System/getenv "PORT")]
       (if (nil? sys-port)
	       (start
           (cond
		         (string? port) (Integer/parseInt port)
		         :else port))
         (start (Integer/parseInt sys-port))))))

