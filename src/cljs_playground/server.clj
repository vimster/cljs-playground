(ns cljs-playground.server
  (:use compojure.core
        cljs-playground.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
  (GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Page not found"))

(defn start
 (-> (handler/site main-routes)
      (wrap-base-url)))
