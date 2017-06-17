(ns alphabet-cipher.core-test
  (:require [clojure.test :refer :all]
            [alphabet-cipher.core :refer :all]))

(deftest getmecode
  (testing "Add your keys."
    (is (= "raffleanswer" (encode "publickey" "yourraffleticketcode")))))
