(ns example.set-spec
  (:require [speclj.core :refer :all]))

(describe
 "set comparisons"
 (context
  "have nice error messages"
  (it "when missing item"
      (should= #{:a :b} #{:a :b :c}))
  (it "when more items"
      (should= #{:a :b :c} #{:a :b}))))
