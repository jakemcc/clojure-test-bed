(ns example.seq-test
  (:require [midje.sweet :refer :all]))

(fact "lists are different sizes"
  '(1 2 3 4) => '(1 2 3))

(fact "lists have different entries"
  '(1 2 3) => '(1 2 4))

(fact "lists can equal vectors"
  '(1 2 3) => [1 2 3])

(fact "compare very different list like values"
  [1 2 3] => '(9 8 7))

