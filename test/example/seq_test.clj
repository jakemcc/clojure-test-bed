(ns example.seq-test
  (:require [clojure.test :refer :all]))

(deftest list-comparisons
  (is (= '(1 2 3) '(1 2 3 4)))
  (is (= '(1 2 4) '(1 2 3)))
  (is (= '(1 2 4) [1 2 4])))
