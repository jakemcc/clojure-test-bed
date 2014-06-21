(ns example.string-test
  (:require [midje.sweet :refer :all]))

(fact "strings are equal"
  "string is equal" => "string is equal")

(fact "strings not equal"
  "space" => "spice")

