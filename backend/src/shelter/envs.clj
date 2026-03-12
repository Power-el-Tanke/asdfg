(ns shelter.envs)

(def env-map
    (-> (System/getenv)
        (select-keys ["SERVER_PORT" 
                      "DATABASE_PORT" 
                      "DATABASE_HOST"
                      "ASSETS_PATH"
                      "ASSETS_URL"])))
                  
(def assets-path (env-map "ASSETS_PATH"))
(def assets-url (env-map "ASSETS_PATH"))