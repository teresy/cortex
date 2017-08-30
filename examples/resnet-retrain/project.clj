(defproject resnet-retrain "0.9.13-SNAPSHOT"
  :description "Retrain resnet50 for aerial imagery"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [thinktopic/experiment "0.9.13-SNAPSHOT"]
                 [thinktopic/think.image "0.4.12"]]
  :uberjar-name "resnet-retrain.jar"
  :main resnet-retrain.core)
