(ns example.list-expectations
  (:require [expectations :refer :all]))

(expect '(1 2 3) '(1 2 3 4))
(expect '(1 2 4) '(1 2 3))
(expect '(9 8 7) [1 2 3])
