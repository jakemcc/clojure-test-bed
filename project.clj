(defproject clojure-test-bed "0.1.0-SNAPSHOT"
  :description "Test bed for trying different testing libraries."
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.15.0"]]}

             :humane-test {:dependencies [[pjstadig/humane-test-output "0.8.0"]]
                           :injections [(require 'pjstadig.humane-test-output)
                                        (pjstadig.humane-test-output/activate!)]}

             :midje {:dependencies [[midje "1.8.3"]]
                     :plugins [[lein-midje "3.2"]]
                     :test-paths ^:replace ["midje"]}

             :expectations {:dependencies [[expectations "2.1.8"]]
                            :plugins [[lein-autoexpect "1.2.2"]]
                            :test-paths ^:replace ["expectations"]}

             :speclj {:dependencies [[speclj "3.3.2"]]
                      :plugins [[speclj "3.3.2"]]
                      :test-paths ^:replace ["spec"]}})
