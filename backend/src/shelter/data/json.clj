(ns shelter.data.json
    (:require [org.clojure.data.json :as json]))

(defn animal-hero-to-json 
    [animal]
    (json/write-str (select-keys animal [:id 
                                         :name
                                         :specie
                                         :description])))