(defproject cljs-playground "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.5.1"]
    [org.clojure/clojurescript "0.0-1859" :exclusions [org.apache.ant/ant]]
    [compojure "1.0.4"]
    [hiccup "1.0.0"]]
  :plugins [[lein-cljsbuild "0.3.3"]]
  :source-paths ["src"]
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src-cljs"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "resources/public/js/main.js"  ; default: target/cljsbuild-main.js
          :optimizations :whitespace
          :pretty-print true}}]}
   :ring {:handler cljs-playground.server/start})
