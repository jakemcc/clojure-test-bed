(ns example.map-test
  (:require [midje.sweet :refer :all]))

(fact "map is missing an entry"
  {:sheep 1} => {:cheese 1 :sheep 1})1

(fact "map has an extra entry"
  {:sheep 1 :cheese 1} => {:sheep 1})

(fact "map has a different value"
  {:sheep 1 :cheese 1} => {:sheep 1 :cheese 5})

