
import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main(args: Array<String>) {
    var t = "2017-11".toDate().plusDays(3)
    println(dateOf(1992,5,7))
    val nyt = dateTimeOf(1992,dayOfMonth = 7,month = 5) atZone "America/New_York"
    println(nyt)
    val l = LocalDate.now()
    val l2 = LocalDate.now()
    println(dateOf(2017) == dateOf(2018))
    println(l+l2)

    val l3 = dateOf(2018,2,1) + 6.days + 3.months
    println(l3)
}






