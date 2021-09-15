function differenceInDays(from_date, to_date){
    return Math.round((to_date-from_date)/(1000*60*60*24))
}



console.log(differenceInDays(Date.parse('4/6/05'),Date.parse('2005-04-18')))
console.log(differenceInDays(Date.parse('4/6/05'),Date.parse('2005-04-14')))
console.log(differenceInDays(Date.parse('4/6/05'),Date.parse('2005-04-8')))

module.exports = { differenceInDays }