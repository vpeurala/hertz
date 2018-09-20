(println "Waiting for SuperCollider to initialize...")

(with-out-str
  (ns hertz.core
    (:require [clojure.edn :as edn]
              [clojure.string :as str]
              [hertz.frequencies :as f]
              [overtone.live :as otl]
              [try-let :refer [try-let]])
    (:use [overtone.core])
    (:gen-class)))

(defn play-note [note]
  (otl/demo 2 (otl/sin-osc (:frequency note) 0.0 1 0)))

(defn ask-tone [note]
  (println (format "Frequency of note %s?" (:note-name note)))
  (play-note note)
  (loop []
    (let [answer-line (read-line)]
      (if (str/blank? (str/trim answer-line))
        (do
          (println (format "Pressing enter without typing anything repeats the tone, which was %s." (:note-name note)))
          (play-note note)
          (recur))
        (try-let [answer (edn/read-string answer-line)]
                 (if (number? answer)
                   (if
                     (= (double answer) (:frequency note))
                     (println "\033[1;32mCorrect!\033[0m")
                     (println (format "\033[1;31mWrong! The correct frequency for %s is %.2f!\033[0m"
                                      (:note-name note)
                                      (:frequency note))))
                   (do
                     (println "\033[1;31mIncorrect answer format, number expected.\033[0m")
                     (recur)))
                 (catch NumberFormatException _ (do
                                                  (println "\033[1;31mIncorrect answer format, number expected.\033[0m")
                                                  (ask-tone note))))))))

(defn -main
  [& _]
  (println "\033[30m\u001B[4;43mHertz\u001B[0m")
  (loop []
    (ask-tone (rand-nth f/piano-notes))
    (recur)))
