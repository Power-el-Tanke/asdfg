(ns shelter.data.json
    (:require [org.clojure.data.json :as json])
    (:use shelter.envs :only [assets-path aseets-url])
    (:import java.nio.file.Path)
    (:import java.nio.file.Files)
    (:import java.nio.file.attributes.FileTime))

(def no-pic-url
     (str assets-url "animals/no_pic.jpg"))

(defn animal-hero-to-json 
    [animal]
    (json/write-str (select-keys animal [:id 
                                         :name
                                         :specie
                                         :description])))

(defn- get-animal-pics
    [animal-id]
    (let [pics-directory (Path/of assets-path "animals" (str animal-id))]
         (if (Files/isDirectory pics-directory)
             (pics (->> pics-directory
                             Files/list
                             (filter #(.endsWith % ".jpg")))))))

(defn- asset-file-to-url
    [path partial-url]
    (str partial-url 
         (.getName path -1)))
                                     
(defn get-animal-pic-url
    [animal-id]
    (let [pics (get-animal-pics animal-id)]
         (if (empty? pics)
             no-pic-url
             (-> (apply max-key 
                        #(cast FileTime (Files/getAttribute % "creationTime"))
                        pics)
                 (asset-file-to-url % (str assets-url "animals/" animal-id "/"))))))

(defn get-all-animal-pics-urls
    [animal-id]
    (let [pics (get-animal-pics animal-id)]
         (if (empty? pics)
             no-pic-url
             (map #(asset-file-to-url % (str assets-url "animals/" animal-id "/"))
                  pics))))