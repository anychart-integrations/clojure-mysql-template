(ns clojure-mysql-template.core
  (:require [org.httpkit.server :refer [run-server]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [clojure.java.jdbc :as jdbc]
            [selmer.parser :as selmer]
            [cheshire.core :as json])
  (:gen-class))


(defn create-db-spec [db port user password]
  {:classname   "com.mysql.cj.jdbc.Driver"
   :subprotocol "mysql"
   :subname     (str "//localhost:" port "/" db "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false")
   :user        user
   :password    password
   :stringtype  "unspecified"})


(defonce db-spec (create-db-spec "anychart_db" 3306 "anychart_user" "anychart_pass"))


(defn get-fruits-data []
  (jdbc/query db-spec ["SELECT * FROM fruits LIMIT 5"]))


(defn show-page [_]
  (let [data (get-fruits-data)]
    (selmer/render-file "templates/page.selmer" {:title      "AnyChart Clojure MySQL template"
                                                 :chart-data (json/generate-string
                                                               {:chart {:type      :pie
                                                                        :title     "Top 5 fruits"
                                                                        :data      data
                                                                        :container "container"}})})))
(defonce server (atom nil))


(defroutes app-routes
           (route/resources "/")
           (GET "/" [] show-page)
           (route/not-found "Page not found. 404 error."))


(defn -main []
  (reset! server (run-server #'app-routes {:port 8080})))