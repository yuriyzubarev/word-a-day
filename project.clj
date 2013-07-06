(defproject wad "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring/ring-core "1.1.0"]
    	           [ring/ring-jetty-adapter "1.1.0"]
                 [hiccup "1.0.3"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [postgresql "9.1-901.jdbc4"]
                 [migratus "0.6.0"]]
  :plugins [[lein-ring "0.8.3"]
            [migratus-lein "0.1.0"]]
  :ring {:handler wad.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}}
  :migratus {:store :database
             :migration-dir "migrations"
             :db ~(get (System/getenv) "DATABASE_URL")})
