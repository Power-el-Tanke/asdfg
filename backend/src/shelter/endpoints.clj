(ns shelter.endpoints
    (:require [shelter.handlers :as handlers])
    (:require [reitit.ring :as rring]))

(def ping-endpoint
    ["/ping" {:get handlers/ping-handler}])

(def router 
    (rring/router [ping-endpoint]))