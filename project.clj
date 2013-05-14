(defproject wad "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring/ring-core "0.8.3"]
    	         [ring/ring-jetty-adapter "0.8.3"]]
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler wad.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
