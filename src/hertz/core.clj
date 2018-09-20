(ns hertz.core
  (:require [clojure.edn :as edn]
            [clojure.term.colors :as c]
            [hertz.frequencies :as f]
            [overtone.live :as otl]
            [try-let :refer [try-let]])
  (:use [overtone.core])
  (:gen-class))

(defn -main
  [& _]
  (println (c/yellow (c/underline "Hertz")))
  (loop []
    (let [note (rand-nth f/freqs)]
      (println (format "Frequency of note %s?" (:note-name note)))
      (otl/demo 2 (otl/sin-osc (:frequency note) 0.0 1 0))
      (try-let [answer (edn/read-string (read-line))]
               (if (number? answer)
                 (if
                   (= (double answer) (:frequency note))
                   (println (c/green "Correct!"))
                   (println (c/red
                              (format "Wrong! The correct frequency for %s is %.2f!"
                                      (:note-name note)
                                      (:frequency note)))))
                 (println (c/red (c/bold "Incorrect answer format, number expected."))))
               (catch NumberFormatException _ (println (c/red (c/bold "Incorrect answer format, number expected."))))))
    (recur)))
