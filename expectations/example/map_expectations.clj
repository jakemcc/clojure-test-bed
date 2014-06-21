(ns example.map-expectations
  (:require [expectations :refer :all]))


(expect {:sheep 1 :cheese 1} {:sheep 1})
(expect {:sheep 1} {:sheep 1 :cheese 1})
(expect {:sheep 1 :cheese 5} {:sheep 1 :cheese 1})

