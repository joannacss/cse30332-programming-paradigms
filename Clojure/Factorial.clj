(defn factorial [n]
  (loop [count n acc 1]              																;; initializes count and acc
     (if (zero? count)               																;; start of if clause
         acc  																																					  ;; condition is true
         (recur (dec count) (* acc count))   								;; condition is false (note recur must be in the "tail position")
     ) ;end if
		) ;end loop
) ; end of function



(def n (Integer/parseInt (first *command-line-args*)))
(def result (factorial n))
(printf "The factorial of %d is %d" n result) 