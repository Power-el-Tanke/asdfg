(ns shelter.handlers)

(defn ping-handler 
    "Ping-Pong request for health checks"
    [req]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body "pong"})