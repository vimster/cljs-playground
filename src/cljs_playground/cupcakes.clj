(ns cljs-playground.cupcakes)

(defn bucket-size 
  "Calculate optimal bucketsize for getting the largest remainder" 
  [cupcakes]
  (+ 1 (int (/ cupcakes 2))))

(defn -main []
  (let [test-cases (Integer. (read-line))]
    (dotimes [n test-cases]
      (println (bucket-size (Integer. (read-line)))))))


