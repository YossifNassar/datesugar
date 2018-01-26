
import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main(args: Array<String>) {
    var t = "2017-11-01".toDate() + 2.days
    println(t)
    println(dateOf(1992,5,7))
    val nyt = dateTimeOf(1992,month = 5,dayOfMonth = 7) atZone "America/New_York"
    println(nyt)
    val l = LocalDate.now()
    val l2 = LocalDate.now()
    println(dateOf(2017) == dateOf(2018))
    println(l+l2)
    val l3 = dateOf(2018,2,1) + 6.days + 3.months + 1.years - 1.years
    println(l3)

    val startDate = LocalDate.now() - 2.years
    val endDate = LocalDate.now()
    println(dateOf(2010) in startDate..endDate)

    println(dateOf(2018,2,1).lastDayOfMonth())
}






