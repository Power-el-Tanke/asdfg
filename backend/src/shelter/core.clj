(ns shelter.core
    (:use [shelter.server :only [start-server]]))

(defn -main []
    (start-server 1234)
    (println "server started at port: " 1234))