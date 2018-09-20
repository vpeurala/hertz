(ns hertz.core
  (:require [clojure.edn :as edn]
            [hertz.frequencies :as f]
            [try-let :refer [try-let]])
  (:gen-class))

(defn -main
  [& _]
  (println "Hertz")
  (println "-----")
  (loop []
    (let [index (rand-int (count f/freqs))
          note (nth f/freqs index)]
      (println (format "Frequency of note %s?" (:note-name note)))
      (try-let [answer (edn/read-string (read-line))]
               (if (number? answer)
                 (if
                   (= (double answer) (:frequency note))
                   (println "Correct!")
                   (println
                     (format "Wrong! The correct frequency for %s is %.2f!"
                             (:note-name note)
                             (:frequency note))))
                 (println "Incorrect answer format, number expected."))
               (catch NumberFormatException e (println "Incorrect answer format, number expected."))))
    (recur)))
