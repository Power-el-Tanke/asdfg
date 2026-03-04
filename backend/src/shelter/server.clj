(ns shelter.server
    (:use [reitit.ring :only [ring-handler]])
    (:use [ring.adapter.jetty :only [run-jetty]])
    (:use [shelter.endpoints :only [router]]))

(defn start-server [port]
    "starts the server in the given port"
    (run-jetty (ring-handler router)
               {:port port
                :join? false}))