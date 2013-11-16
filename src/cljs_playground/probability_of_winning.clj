(ns cljs-playground.probability-of-winning)

(defn prob [n]
  (let [x (nth n 0)
        y (nth n 1)]
  (float (/ x (+ x y)))))
  

(let [test-cases (Integer. (read-line))]
  (dotimes [n test-cases]
    (println (prob (map read-string (clojure.string/split (read-line) #"\s+"))))))