(def number-and-base '(("255" 10) ("11111111" 2) ("377" 8) ("FF" 16)))

(map (fn [x] (apply #(Integer/parseInt %)) number-and-base)

;;; not sure why this isnt doing
;;; (Integer/parseInt "255" 10)
;;; (Integer/parseInt "11111111" 2)
;;; (Integer/parseInt "377" 8)
;;; (Integer/parseInt "FF" 16)

;; [00:40] durka42: metaperl: can't treat java methods as first-class fns. use #(Integer/parseInt %)
;; [00:41] metaperl: ouch
;; [00:41] metaperl: what does taht % sign do?
;; [00:42] metaperl: Is it still fn [x]
;; [00:42] Join: rfgpfeiffer (n=rfgpfeif@e178214014.adsl.alicedsl.de)
;; [00:43] Part: brianh (n=chatzill@71-222-241-56.albq.qwest.net) - ()
;; [00:43] ayrnieu: #(f %) => (fn [x] (f x)), #(f %1 %2 %3) => (fn [x y z] (f x y z))

(def two-args (fn [s r] (Integer/parseInt s r)))

(map (fn [x] apply two-args x) number-and-base)

;;; aha!

(map (fn [x] apply #(Integer/parseInt %1 %2) x) number-and-base)


