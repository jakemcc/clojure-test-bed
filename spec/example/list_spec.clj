(ns example.string-spec
  (:require [speclj.core :refer :all]))

(describe
 "List/vector comparissons"
 (it "when there is an extra element"
     (should= '(1 2 3) '(1 2 3 4)))
 (it "when there is a mismatched element"
     (should= '(1 2 4) '(1 2 3)))
 (it "when comparing different types"
     (should= '(9 8 7) [1 2 3])))

