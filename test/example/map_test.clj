(ns example.map-test
  (:require [clojure.test :refer :all]))

(deftest map-comparisons
  (is (= {:sheep 1} {:cheese 1 :sheep 1}))
  (is (= {:sheep 1 :cheese 1} {:sheep 1}))
  (is (= {:sheep 1 :cheese 1} {:sheep 1 :cheese 5})))
