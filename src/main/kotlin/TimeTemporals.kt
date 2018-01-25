import java.time.LocalDate

interface TimeTemporal {
    fun plusDate(d: LocalDate, toAdd: Long): LocalDate
    fun getValue() : Long
}

class Days(val v: Long) : TimeTemporal {
    override fun plusDate(d: LocalDate, toAdd: Long): LocalDate {
        return d.plusDays(toAdd)
    }

    override fun getValue(): Long {
        return v
    }
}

class Years(val v: Long) : TimeTemporal {
    override fun plusDate(d: LocalDate, toAdd: Long): LocalDate {
        return d.plusYears(toAdd)
    }

    override fun getValue(): Long {
        return v
    }
}

class Months(val v: Long) : TimeTemporal {
    override fun plusDate(d: LocalDate, toAdd: Long): LocalDate {
        return d.plusMonths(toAdd)
    }

    override fun getValue(): Long {
        return v
    }
}
