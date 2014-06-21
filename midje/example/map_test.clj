(ns example.map-test
  (:require [midje.sweet :refer :all]))

(fact "map is missing an entry"
  {:sheep 1} => {:goats 1 :sheep 1})

(fact "fact has extra mapping"
  {:goats 1 :sheep 1} => {:sheep 1})

