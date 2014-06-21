(ns example.set-expectations
  (:require [expectations :refer :all]))

(expect #{:a :b} #{:a :b :c})
(expect #{:a :b :c} #{:a :b})
