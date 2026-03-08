(ns shelter.db
    (require [hikari-cp])
    (require [com.github.seancorfield/next.jdbc :as [jdbc]]))

(defn create-db-handler 
    [host port name user password]
    (let [options {:host host
                   :port port
                   :name name
                   :user user
                   :password password}]
         (->> options
              (jdbc.connection/pool-> 'hikari-cp)
              jdbc/get-datasource)))