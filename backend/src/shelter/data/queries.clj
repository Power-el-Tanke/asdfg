(ns shelter.data.queries
    (require [com.github.seancorfield/next.jdbc :as [jdbc]]))

(defn get-top-animals 
    [hanlder limit]
    (jdbc/execute!  handler 
                    ["SELECT (id, name, specie, description) 
                      FROM adoptable 
                      LIMIT ?"] 
                    limit))