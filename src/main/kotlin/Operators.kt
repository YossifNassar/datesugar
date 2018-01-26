import java.time.LocalDate

operator fun LocalDate.plus(other: LocalDate): LocalDate {
    return this.plusDays(other.dayOfMonth.toLong()).plusMonths(other.monthValue.toLong()).plusYears(other.year.toLong())
}

operator fun LocalDate.plus(temporal: TimeTemporal): LocalDate = temporal.plusDate(this,temporal.getValue())

operator fun LocalDate.minus(other: LocalDate): LocalDate {
    return this.plusDays(-other.dayOfMonth.toLong()).plusMonths(-other.monthValue.toLong()).plusYears(-other.year.toLong())
}

operator fun LocalDate.minus(temporal: TimeTemporal): LocalDate = temporal.plusDate(this,-temporal.getValue())

class LocalDateRange(override val start: LocalDate, override val endInclusive: LocalDate) : ClosedRange<LocalDate>

fun LocalDate.lastDayOfMonth(): Int {
    val end = this.withDayOfMonth(this.lengthOfMonth())
    return end.dayOfMonth
}


