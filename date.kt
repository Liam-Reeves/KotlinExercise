


import java.time.LocalDate
import java.time.LocalTime
import java.time.DayOfWeek

fun main(){
    time()

}
fun time(){
    var clock = LocalTime.now()
    var date =LocalDate.now()
    var day =date.dayOfWeek
    var month =date.month
    var year =date.year
//    var days:Int =

//    println(clock)
    println(date)
    println(day)
    println(month)


    if(clock >LocalTime.NOON){
        println("Good Afternoon Kotlin")

    }else if(clock<LocalTime.NOON){
        println("Good Morning Kotlin")

    }else if(clock>LocalTime.MIDNIGHT){
        println("Good evening Kotlin")
    }



}