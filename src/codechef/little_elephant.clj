(ns little-elephant)

(defn count-invs [list] 
  (if (= (count list) 1)
    0
    (+ (count (filter #(> (first list) %) (rest list))) (count-invs (rest list)))))

(defn is-good [_ list]
  (let [local-invs (count (filter #(> (first %) (second %)) (partition 2 1 list)))
        invs (count-invs list)]
    (if (= local-invs invs)
      "YES"
      "NO")))
  

(let [test-cases (Integer. (read-line))]
  (dotimes [n test-cases]
    (println (is-good (read-line) (seq (map read-string (.split (read-line) " ")))))))
