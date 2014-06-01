(ns example.expectations
  (:require [expectations :refer :all]))


(expect "strings equal" "strings equal")
(expect "strings equal" "strings not equal")


(expect {:sheep 1 :cheese 0} {:sheep 1 :cheese 5})
(expect {:sheep 1} {:sheep 1 :cheese 5})
(expect {:sheep 1 :cheese 0} {:sheep 1})



(expect #{:a :b} #{:a :b :c})
(expect #{:a :b :c} #{:a :b})


(expect '(1 2 3) '(1 2 3 4))
(expect '(1 2 4) '(1 2 3))
(expect '(9 8 7) [1 2 4])
(expect [2 2 4] [1 2 4])
