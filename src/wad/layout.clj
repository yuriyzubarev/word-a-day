(ns wad.layout
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css)]))

(defn common [title & body]
  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:title title]
    (include-css "/css/bootstrap.css"
                 "/css/app.css"
                 "/css/bootstrap-responsive.css")]
   [:body
    [:div.navbar.navbar-inverse.navbar-fixed-top
     [:div.navbar-inner
      [:div.container
       [:button.btn.btn-navbar {:type "button" :data-toggle "collapse" :data-target ".nav-collapse"}
        [:span.icon-bar]
        [:span.icon-bar]
        [:span.icon-bar]]
       [:a.brand {:href "#"} "WAD"]
       [:div.nav-collapse.collapse
        [:ul.nav]]]]]

     [:div.container
      [:h1 "WAD home page"]
      [:p body]]]))

