import java.sql.Date
import java.time.LocalDate
import java.time.LocalTime

fun main(){
    display()

}
fun display(){
    var time =LocalTime.now()
    println(time)
    var date =LocalDate.now()
    var day =date.dayOfWeek
    println(day)
    var month =date.month
    println(month)
    var year =date.year
    println(year)

}