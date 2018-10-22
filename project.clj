(defproject clojure-mysql-template "0.1.0-SNAPSHOT"
  :description "AnyChart Clojure MySQL template"
  :url "https://github.com/anychart-integrations/clojure-mysql-template"
  :license {:name "Apache License"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [mysql/mysql-connector-java "8.0.13"]
                 [selmer "1.12.2"]
                 [cheshire "5.8.1"]]
  :main ^:aot clojure-mysql-template.core
  :plugins [[lein-ancient "0.6.10"]]
  :uberjar-name "clojure-mysql-template.jar")
