(ns example.speclj-spec
  (:require [speclj.core :refer :all]))

(describe
 "Truth"
 (it "is true"
     (should true)))

(describe
 "Sting comparisons"

 (it "have nice error message"
     (should= "sheep" "shape")))

(describe
 "map comparsions have nice error messages"
 (it "when mismatched values"
     (should= {:cows 1 :pigs 2} {:cows 1 :pigs 5}))
 (it "when missing keys"
     (should= {:cows 1 :pigs 5} {:cows 1})))

(describe
 "set comparisons"
 (context
  "have nice error messages"
  (it "when missing item"
      (should= #{:a :b} #{:a}))
  (it "when more items"
      (should= #{:a :b} #{:a :b :c}))))

