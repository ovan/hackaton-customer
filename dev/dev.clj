(ns dev
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :refer (pprint)]
            [clojure.repl :refer :all]
            [clojure.test :as test]
            [clojure.tools.namespace.repl :refer (refresh refresh-all)]
            [clojure.core.async :refer [go go-loop <! >!]]
            [hackaton-customer.system :as system]))

;; Test stuff

(def system nil)

(defn init
  "Constructs the current development system."
  []
  (alter-var-root #'system
                  (constantly (system/init))))

(defn start
  "Starts the current development system."
  []
  (alter-var-root #'system system/start)
  :started)

(defn stop
  "Shuts down and destroys the current development system."
  []
  (alter-var-root #'system
                  (fn [s] (when s (system/stop s))))
  :stopped)

(defn run
  "Initializes the current development system and starts it running."
  []
  (init)
  (start))

(defn reset []
  (stop)
  (refresh :after 'dev/run))

(comment
  (init)

  (run)

  (reset)

  (stop)

  (refresh)

  (pprint system)

  )
