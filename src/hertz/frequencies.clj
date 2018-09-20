(ns hertz.frequencies)

; http://www.inspiredacoustics.com/en/MIDI_note_numbers_and_center_frequencies
(def all-notes [
                {:note-name "C0" :frequency 16.35 :midi-note-number 12}
                {:note-name "C#0" :frequency 17.32 :midi-note-number 13}
                {:note-name "Db0" :frequency 17.32 :midi-note-number 13}
                {:note-name "D0" :frequency 18.35 :midi-note-number 14}
                {:note-name "D#0" :frequency 19.45 :midi-note-number 15}
                {:note-name "Eb0" :frequency 19.45 :midi-note-number 15}
                {:note-name "E0" :frequency 20.60 :midi-note-number 16}
                {:note-name "F0" :frequency 21.83 :midi-note-number 17}
                {:note-name "F#0" :frequency 23.12 :midi-note-number 18}
                {:note-name "Gb0" :frequency 23.12 :midi-note-number 18}
                {:note-name "G0" :frequency 24.50 :midi-note-number 19}
                {:note-name "G#0" :frequency 25.96 :midi-note-number 20}
                {:note-name "Ab0" :frequency 25.96 :midi-note-number 20}
                {:note-name "A0" :frequency 27.50 :midi-note-number 21 :piano-key 1}
                {:note-name "A#0" :frequency 29.14 :midi-note-number 22 :piano-key 2}
                {:note-name "Bb0" :frequency 29.14 :midi-note-number 22 :piano-key 2}
                {:note-name "B0" :frequency 30.87 :midi-note-number 23 :piano-key 3}
                {:note-name "C1" :frequency 32.70 :midi-note-number 24 :piano-key 4}
                {:note-name "C#1" :frequency 34.65 :midi-note-number 25 :piano-key 5}
                {:note-name "Db1" :frequency 34.65 :midi-note-number 25 :piano-key 5}
                {:note-name "D1" :frequency 36.71 :midi-note-number 26 :piano-key 6}
                {:note-name "D#1" :frequency 38.89 :midi-note-number 27 :piano-key 7}
                {:note-name "Eb1" :frequency 38.89 :midi-note-number 27 :piano-key 7}
                {:note-name "E1" :frequency 41.20 :midi-note-number 28 :piano-key 8}
                {:note-name "F1" :frequency 43.65 :midi-note-number 29 :piano-key 9}
                {:note-name "F#1" :frequency 46.25 :midi-note-number 30 :piano-key 10}
                {:note-name "Gb1" :frequency 46.25 :midi-note-number 30 :piano-key 10}
                {:note-name "G1" :frequency 49.00 :midi-note-number 31 :piano-key 11}
                {:note-name "G#1" :frequency 51.91 :midi-note-number 32 :piano-key 12}
                {:note-name "Ab1" :frequency 51.91 :midi-note-number 32 :piano-key 12}
                {:note-name "A1" :frequency 55.00 :midi-note-number 33 :piano-key 13}
                {:note-name "A#1" :frequency 58.27 :midi-note-number 34 :piano-key 14}
                {:note-name "Bb1" :frequency 58.27 :midi-note-number 34 :piano-key 14}
                {:note-name "B1" :frequency 61.74 :midi-note-number 35 :piano-key 15}
                {:note-name "C2" :frequency 65.41 :midi-note-number 36 :piano-key 16}
                {:note-name "C#2" :frequency 69.30 :midi-note-number 37 :piano-key 17}
                {:note-name "Db2" :frequency 69.30 :midi-note-number 37 :piano-key 17}
                {:note-name "D2" :frequency 73.42 :midi-note-number 38 :piano-key 18}
                {:note-name "D#2" :frequency 77.78 :midi-note-number 39 :piano-key 19}
                {:note-name "Eb2" :frequency 77.78 :midi-note-number 39 :piano-key 19}
                {:note-name "E2" :frequency 82.41 :midi-note-number 40 :piano-key 20}
                {:note-name "F2" :frequency 87.31 :midi-note-number 41 :piano-key 21}
                {:note-name "F#2" :frequency 92.50 :midi-note-number 42 :piano-key 22}
                {:note-name "Gb2" :frequency 92.50 :midi-note-number 42 :piano-key 22}
                {:note-name "G2" :frequency 98.00 :midi-note-number 43 :piano-key 23}
                {:note-name "G#2" :frequency 103.83 :midi-note-number 44 :piano-key 24}
                {:note-name "Ab2" :frequency 103.83 :midi-note-number 44 :piano-key 24}
                {:note-name "A2" :frequency 110.00 :midi-note-number 45 :piano-key 25}
                {:note-name "A#2" :frequency 116.54 :midi-note-number 46 :piano-key 26}
                {:note-name "Bb2" :frequency 116.54 :midi-note-number 46 :piano-key 26}
                {:note-name "B2" :frequency 123.47 :midi-note-number 47 :piano-key 27}
                {:note-name "C3" :frequency 130.81 :midi-note-number 48 :piano-key 28}
                {:note-name "C#3" :frequency 138.59 :midi-note-number 49 :piano-key 29}
                {:note-name "Db3" :frequency 138.59 :midi-note-number 49 :piano-key 29}
                {:note-name "D3" :frequency 146.83 :midi-note-number 50 :piano-key 30}
                {:note-name "D#3" :frequency 155.56 :midi-note-number 51 :piano-key 31}
                {:note-name "Eb3" :frequency 155.56 :midi-note-number 51 :piano-key 31}
                {:note-name "E3" :frequency 164.81 :midi-note-number 52 :piano-key 32}
                {:note-name "F3" :frequency 174.61 :midi-note-number 53 :piano-key 33}
                {:note-name "F#3" :frequency 185.00 :midi-note-number 54 :piano-key 34}
                {:note-name "Gb3" :frequency 185.00 :midi-note-number 54 :piano-key 34}
                {:note-name "G3" :frequency 196.00 :midi-note-number 55 :piano-key 35}
                {:note-name "G#3" :frequency 207.65 :midi-note-number 56 :piano-key 36}
                {:note-name "Ab3" :frequency 207.65 :midi-note-number 56 :piano-key 36}
                {:note-name "A3" :frequency 220.00 :midi-note-number 57 :piano-key 37}
                {:note-name "A#3" :frequency 233.08 :midi-note-number 58 :piano-key 38}
                {:note-name "Bb3" :frequency 233.08 :midi-note-number 58 :piano-key 38}
                {:note-name "B3" :frequency 246.94 :midi-note-number 59 :piano-key 39}
                {:note-name "C4" :frequency 261.63 :midi-note-number 60 :piano-key 40}
                {:note-name "C#4" :frequency 277.18 :midi-note-number 61 :piano-key 41}
                {:note-name "Db4" :frequency 277.18 :midi-note-number 61 :piano-key 41}
                {:note-name "D4" :frequency 293.66 :midi-note-number 62 :piano-key 42}
                {:note-name "D#4" :frequency 311.13 :midi-note-number 63 :piano-key 43}
                {:note-name "Eb4" :frequency 311.13 :midi-note-number 63 :piano-key 43}
                {:note-name "E4" :frequency 329.63 :midi-note-number 64 :piano-key 44}
                {:note-name "F4" :frequency 349.23 :midi-note-number 65 :piano-key 45}
                {:note-name "F#" :frequency 369.99 :midi-note-number 66 :piano-key 46}
                {:note-name "Gb4" :frequency 369.99 :midi-note-number 66 :piano-key 46}
                {:note-name "G4" :frequency 392.00 :midi-note-number 67 :piano-key 47}
                {:note-name "G#4" :frequency 415.30 :midi-note-number 68 :piano-key 48}
                {:note-name "Ab4" :frequency 415.30 :midi-note-number 68 :piano-key 48}
                {:note-name "A4" :frequency 440.00 :midi-note-number 69 :piano-key 49}
                {:note-name "A#4" :frequency 466.16 :midi-note-number 70 :piano-key 50}
                {:note-name "Bb4" :frequency 466.16 :midi-note-number 70 :piano-key 50}
                {:note-name "B4" :frequency 493.88 :midi-note-number 71 :piano-key 51}
                {:note-name "C5" :frequency 523.25 :midi-note-number 72 :piano-key 52}
                {:note-name "C#5" :frequency 554.37 :midi-note-number 73 :piano-key 53}
                {:note-name "Db5" :frequency 554.37 :midi-note-number 73 :piano-key 53}
                {:note-name "D5" :frequency 587.33 :midi-note-number 74 :piano-key 54}
                {:note-name "D#5" :frequency 622.25 :midi-note-number 75 :piano-key 55}
                {:note-name "Eb5" :frequency 622.25 :midi-note-number 75 :piano-key 55}
                {:note-name "E5" :frequency 659.26 :midi-note-number 76 :piano-key 56}
                {:note-name "F5" :frequency 698.46 :midi-note-number 77 :piano-key 57}
                {:note-name "F#5" :frequency 739.99 :midi-note-number 78 :piano-key 58}
                {:note-name "Gb5" :frequency 739.99 :midi-note-number 78 :piano-key 58}
                {:note-name "G5" :frequency 783.99 :midi-note-number 79 :piano-key 59}
                {:note-name "G#5" :frequency 830.61 :midi-note-number 80 :piano-key 60}
                {:note-name "Ab5" :frequency 830.61 :midi-note-number 80 :piano-key 60}
                {:note-name "A5" :frequency 880.00 :midi-note-number 81 :piano-key 61}
                {:note-name "A#5" :frequency 932.33 :midi-note-number 82 :piano-key 62}
                {:note-name "Bb5" :frequency 932.33 :midi-note-number 82 :piano-key 62}
                {:note-name "B5" :frequency 987.77 :midi-note-number 83 :piano-key 63}
                {:note-name "C6" :frequency 1046.50 :midi-note-number 84 :piano-key 64}
                {:note-name "C#6" :frequency 1108.73 :midi-note-number 85 :piano-key 65}
                {:note-name "Db6" :frequency 1108.73 :midi-note-number 85 :piano-key 65}
                {:note-name "D6" :frequency 1174.66 :midi-note-number 86 :piano-key 66}
                {:note-name "D#6" :frequency 1244.51 :midi-note-number 87 :piano-key 67}
                {:note-name "Eb6" :frequency 1244.51 :midi-note-number 87 :piano-key 67}
                {:note-name "E6" :frequency 1318.51 :midi-note-number 88 :piano-key 68}
                {:note-name "F6" :frequency 1396.91 :midi-note-number 89 :piano-key 69}
                {:note-name "F#6" :frequency 1479.98 :midi-note-number 90 :piano-key 70}
                {:note-name "Gb6" :frequency 1479.98 :midi-note-number 90 :piano-key 70}
                {:note-name "G6" :frequency 1567.98 :midi-note-number 91 :piano-key 71}
                {:note-name "G#6" :frequency 1661.22 :midi-note-number 92 :piano-key 72}
                {:note-name "Ab6" :frequency 1661.22 :midi-note-number 92 :piano-key 72}
                {:note-name "A6" :frequency 1760.00 :midi-note-number 93 :piano-key 73}
                {:note-name "A#6" :frequency 1864.66 :midi-note-number 94 :piano-key 74}
                {:note-name "Bb6" :frequency 1864.66 :midi-note-number 94 :piano-key 74}
                {:note-name "B6" :frequency 1975.53 :midi-note-number 95 :piano-key 75}
                {:note-name "C7" :frequency 2093.00 :midi-note-number 96 :piano-key 76}
                {:note-name "C#7" :frequency 2217.46 :midi-note-number 97 :piano-key 77}
                {:note-name "Db7" :frequency 2217.46 :midi-note-number 97 :piano-key 77}
                {:note-name "D7" :frequency 2349.32 :midi-note-number 98 :piano-key 78}
                {:note-name "D#7" :frequency 2489.02 :midi-note-number 99 :piano-key 79}
                {:note-name "Eb7" :frequency 2489.02 :midi-note-number 99 :piano-key 79}
                {:note-name "E7" :frequency 2637.02 :midi-note-number 100 :piano-key 80}
                {:note-name "F7" :frequency 2793.83 :midi-note-number 101 :piano-key 81}
                {:note-name "F#7" :frequency 2959.96 :midi-note-number 102 :piano-key 82}
                {:note-name "Gb7" :frequency 2959.96 :midi-note-number 102 :piano-key 82}
                {:note-name "G7" :frequency 3135.96 :midi-note-number 103 :piano-key 83}
                {:note-name "G#7" :frequency 3322.44 :midi-note-number 104 :piano-key 84}
                {:note-name "Ab7" :frequency 3322.44 :midi-note-number 104 :piano-key 84}
                {:note-name "A7" :frequency 3520.00 :midi-note-number 105 :piano-key 85}
                {:note-name "A#7" :frequency 3729.31 :midi-note-number 106 :piano-key 86}
                {:note-name "Bb7" :frequency 3729.31 :midi-note-number 106 :piano-key 86}
                {:note-name "B7" :frequency 3951.07 :midi-note-number 107 :piano-key 87}
                {:note-name "C8" :frequency 4186.01 :midi-note-number 108 :piano-key 88}
                {:note-name "C#8" :frequency 4434.92 :midi-note-number 109}
                {:note-name "Db8" :frequency 4434.92 :midi-note-number 109}
                {:note-name "D8" :frequency 4698.63 :midi-note-number 110}
                {:note-name "D#8" :frequency 4978.03 :midi-note-number 111}
                {:note-name "Eb8" :frequency 4978.03 :midi-note-number 111}
                {:note-name "E8" :frequency 5274.04 :midi-note-number 112}
                {:note-name "F8" :frequency 5587.65 :midi-note-number 113}
                {:note-name "F#8" :frequency 5919.91 :midi-note-number 114}
                {:note-name "Gb8" :frequency 5919.91 :midi-note-number 114}
                {:note-name "G8" :frequency 6271.93 :midi-note-number 115}
                {:note-name "G#8" :frequency 6644.88 :midi-note-number 116}
                {:note-name "Ab8" :frequency 6644.88 :midi-note-number 116}
                {:note-name "A8" :frequency 7040.00 :midi-note-number 117}
                {:note-name "A#8" :frequency 7458.62 :midi-note-number 118}
                {:note-name "Bb8" :frequency 7458.62 :midi-note-number 118}
                {:note-name "B8" :frequency 7902.13 :midi-note-number 119}
                {:note-name "C9" :frequency 8372.02 :midi-note-number 120}
                ])

(def piano-notes (filter #(not (nil? (:piano-key %))) all-notes))
