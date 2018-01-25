import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun String.toDate(): LocalDate = LocalDate.parse(this, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
