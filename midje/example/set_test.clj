(ns example.set-test
  (:require [midje.sweet :refer :all]))


(fact "set is subset of expected"
  #{:a :b} => #{:a :b :c})

(fact "set is superset of expected"
   #{:a :b :c} => #{:a :b})
