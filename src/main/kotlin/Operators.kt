import java.time.LocalDate

operator fun LocalDate.plus(other: LocalDate): LocalDate {
    return this.plusDays(other.dayOfMonth.toLong()).plusMonths(other.monthValue.toLong()).plusYears(other.year.toLong())
}

operator fun LocalDate.plus(temporal: TimeTemporal): LocalDate = temporal.plusDate(this,temporal.getValue())



