(ns cljs-playground.probability-of-winning)

; Use of theorem of total Probabilty
; P(WIN) = P(WIN|A) * P(A)  +  P(WIN|B) * P(B)
;
(defn prob [n]
  (let [x (nth n 0)
        y (nth n 1)]
  (float (/ x (+ x y)))))
  

(let [test-cases (Integer. (read-line))]
  (dotimes [n test-cases]
    (println (prob (map read-string (.split (read-line) " "))))))