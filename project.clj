(defproject aikakone-backend "0.1.0-SNAPSHOT"
  :source-paths
  ["src"]
  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [cheshire "5.8.0"]
                 [clojure.java-time "0.3.2"]
                 [compojure "1.6.0"]
                 [com.taoensso/sente "1.12.0"]
                 [http-kit "2.2.0"]
                 [ring/ring-defaults "0.2.0"]
                 [ring-cors "0.1.7"]]
  :uberjar-name "aikakone-backend-standalone.jar")
