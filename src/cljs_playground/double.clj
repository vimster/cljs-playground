(ns cljs-playground.double)

(defn max-chars [n]
  (if (even? n)
    n
    (dec n)))
  
  (defn -main []
  (let [test-cases (Integer. (read-line))]
    (dotimes [n test-cases]
      (println (max-chars (Integer. (read-line)))))))