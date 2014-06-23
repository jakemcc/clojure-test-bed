(ns example.string-spec
  (:require [speclj.core :refer :all]))

(describe "String comparisons"
 (it "have nice error message"
     (should= "space" "spice")))

