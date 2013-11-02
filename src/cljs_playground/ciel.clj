(ns cljs-playground.ciel)

(def max-menue-price 2048) 

(defn count-menues [n]
  (loop [i n occ 0]
    (if (zero? i)
      occ
      (recur (quot i 2) (+ occ (mod i 2))))))

(defn min-menues [price]
  (let [m (quot price max-menue-price)
        rest (mod price max-menue-price)]
    (+ (count-menues rest) m)))

; second approach
(defn count-ones [n]
  (count (filter #(= % \1) (seq (Integer/toString n 2)))))

(defn menus [price]
  (if (> price 2048)
    (+ (quot price 2048) (count-ones (rem price 2048)))
    (count-ones price)))


(defn -main []
  (loop [test-cases (read-string (read-line))]
    (when (> test-cases 0)
      (println (menus (read-string (read-line))))
      (recur (dec test-cases)))))