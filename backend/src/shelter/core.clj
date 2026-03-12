(ns shelter.core
    (:use [shelter.server :only [start-server]])
    (:use [shelter.envs :only [env-map]]))

(defn -main [] (let [port (Integer/parseInt (env-map "SERVER_PORT"))]
        (start-server port)
        (println "server started at port: " port)))