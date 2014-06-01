(ns example.clojure-test
  (:require [clojure.test :refer :all]))

(deftest string-comparisons
  (is (= "strings equal" "strings equal"))
  (is (= "space" "spice")))

(deftest map-comparisons
  (is (= {:sheep 1} {:goats 1 :sheep 1}))
  (is (= {:goats 1 :sheep 1} {:sheep 1})))

(deftest set-comparisons
  (is (= #{:a :b} #{:a :b :c}))
  (is (= #{:a :b :c} #{:a :b})))

(deftest list-comparisons
  (is (= '(1 2 3) '(1 2 3 4)))
  (is (= '(1 2 4) '(1 2 3)))
  (is (= '(1 2 4) [1 2 4])))


