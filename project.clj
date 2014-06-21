(defproject example "0.1.0-SNAPSHOT"
  :description "Test bed for trying different testing libraries."
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:clojure-test {:plugins [[com.jakemccrary/lein-test-refresh "0.5.0"]]}

             :midje {:dependencies [[midje "1.6.3"]]
                     :plugins [[lein-midje "3.1.3"]]
                     :test-paths ^:replace ["midje"]}

             :expectations {:dependencies [[expectations "2.0.6"]]
                            :plugins [[lein-autoexpect "1.2.2"]]
                            :test-paths ^:replace ["expectations"]}
             
             :speclj {:dependencies [[speclj "3.0.0"]]
                      :plugins [[speclj "3.0.0"]]
                      :test-paths ^:replace ["spec"]}})
