(ns example.map-test
  (:require [clojure.test :refer :all]))

(deftest map-comparisons
  (is (= {:sheep 1} {:goats 1 :sheep 1}))
  (is (= {:goats 1 :sheep 1} {:sheep 1})))
