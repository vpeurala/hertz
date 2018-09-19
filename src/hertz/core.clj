(ns hertz.core
  (:require [clojure.edn :refer [read-string]]
            [hertz.frequencies :as f])
  (:gen-class))

(defn -main
  [& _]
  (println "Hertz")
  (println "-----")
  (loop []
    (let [index (rand-int (count f/freqs))
          note (nth f/freqs index)]
      (println (format "Frequency of note %s?" (:note-name note)))
      (let [answer (read-string (read-line))]
        (if (number? answer)
          (if
            (= (double answer) (:frequency note))
            (println "Correct!")
            (println (format "Wrong! The correct frequency is %.2f!" (:frequency note)))
            )
          (println "Incorrect answer format, number expected."))))
    (recur)))
