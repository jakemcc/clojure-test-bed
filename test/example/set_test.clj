(ns example.set-test
  (:require [clojure.test :refer :all]))

(deftest set-comparisons
  (is (= #{:a :b} #{:a :b :c}))
  (is (= #{:a :b :c} #{:a :b})))
