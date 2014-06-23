(ns example.map-spec
  (:require [speclj.core :refer :all]))

(describe
 "map comparisons have nice error messages"
 (it "when extra entries keys present"
     (should= {:sheep 1} {:sheep 1 :cheese 1}))
  (it "when missing an entry"
     (should= {:sheep 1 :cheese 1} {:sheep 1}))
 (it "when mismatched values"
     (should= {:sheep 1 :cheese 5} {:sheep 1 :cheese 1})))

