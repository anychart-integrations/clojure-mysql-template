(defproject clojure-mysql-template "0.1.0-SNAPSHOT"
  :description "AnyChart Clojure MySQL template"
  :url "https://github.com/anychart-integrations/clojure-mysql-template"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [mysql/mysql-connector-java "8.0.12"]
                 [selmer "1.12.2"]]
  :main ^:aot clojure-mysql-template.core
  :plugins [[lein-ancient "0.6.10"]]
  :uberjar-name "clojure-mysql-template.jar")
