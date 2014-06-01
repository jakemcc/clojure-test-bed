(defproject example "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[expectations "2.0.6"]
                                  [midje "1.6.3"]]
                   :plugins [[lein-autoexpect "1.2.2"]
                             [com.jakemccrary/lein-test-refresh "0.5.0"]]}
             :speclj {:dependencies [[speclj "3.0.0"]]
                      :plugins [[speclj "3.0.0"]]
                      :test-paths ^:replace ["spec"]}})
