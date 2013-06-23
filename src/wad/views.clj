(ns wad.views
  (:use [hiccup core page]
        [hiccup.form :only (form-to label text-area submit-button)])
  (:require [wad.layout :as layout]))

(defn db-page [& body]
  (layout/common
     "DB playground"
     (form-to [:post "/"]
              (label "title" "What's the title?")
              (text-area "title")
              (submit-button "GO!"))
     (str body)))
