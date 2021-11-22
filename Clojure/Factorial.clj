(defn factorial [n]
  	(loop [count n acc 1]		;; initializes count and acc
     	(if (zero? count)      ;; start of if clause
         	acc  				;; condition is true
         	(recur (dec count) (* acc count)) ;; condition is false (note recur must be in the "tail position")
     ) ;end if
	) ;end loop
) ; end of function

(println (factorial 5))