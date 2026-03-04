(defproject app "0.1.0-SNAPSHOT"
  :description "Animal Shelter located in Cuba"
  :url "http://example.com/FIXME"
  :license {:name "GPL-3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.15.3"]
                 [ring/ring-jetty-adapter "1.15.3"]
                 [com.github.seancorfield/next.jdbc "1.3.1093"]
                 [org.postgresql/postgresql "42.7.10"]
                 [hikari-cp "4.0.0"]
                 [org.clojure/data.json "2.5.2"]
                 [metosin/reitit "0.10.0"]
                 [metosin/reitit-ring "0.10.0"]]
  :main shelter.core
  :repl-options {:init-ns shelter.core})
