(defproject hackaton-customer "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.338.0-5c5012-alpha"]
                 [cheshire "5.3.1"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.3.1"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [ring/ring-devel "1.2.1"]]}})
