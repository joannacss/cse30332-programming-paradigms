for c in [1..40]
  for b in [1...c]
    for a in [1...b]
      console.log "#{a}, #{b}, #{c}" if a * a + b * b is c * c


# JavaScript
#for (let c = 1; c <= 40; c++) { 
#  for (let b = 1; b < c; b++) {
#    for (let a = 1; a < b; a++) {
#      if (a * a + b * b === c * c) {
#        console.log(`${a}, ${b}, ${c}`); 
#      }
#    }
#  }
#}