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

(defn -main []
  (let [test-cases (Integer. (read-line))]
    (dotimes [n test-cases]
      (println (min-menues (Integer. (read-line)))))))