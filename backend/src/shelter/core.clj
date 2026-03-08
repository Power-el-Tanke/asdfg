(ns shelter.core
    (:use [shelter.server :only [start-server]]))

(def env-map
    (-> (System/getenv)
        (select-keys ["SERVER_PORT" 
                      "DATABASE_PORT" 
                      "DATABASE_HOST"])))

(defn -main [] (let [port (Integer/parseInt (env-map "SERVER_PORT"))]
        (start-server port)
        (println "server started at port: " port)))