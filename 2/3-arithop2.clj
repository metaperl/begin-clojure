(str "21 from 25 is " (- 25 21))
(str "4 + 13 - 7 is " (- (+ 4 13) 7))
;; [01:51] metaperl wants to create a StringBuilder instance and pass it to the constructor of Formatter
;; [01:51] metaperl: really I just want to create a string which has the result of (- 25 21) in it
;; [01:52] metaperl: printf "the result is %d", 25-21
;; [01:53] hiredman: ,(str "the result is " (- 25 21))
;; [01:53] clojurebot: "the result is 4"
;; [01:55] durka42: yuck
;; [01:55] durka42: ,(.toString (. (java.util.Formatter.) format "the result is %d" (into-array [(- 25 21)])))
;; [01:55] clojurebot: "the result is 4"
