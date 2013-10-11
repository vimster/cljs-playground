(ns hello-wolrd.core)

(defmacro log [& more]
  `(.log js/console (str ~@more)))

(defn foo
  "I don't do a whole lot."
  [x]
  (.log js/console "sdfsdf " x)
  (js/alert (str "huhusdf " x)))


;(foo "sf")

