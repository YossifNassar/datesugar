val Int.days: TimeTemporal
    get() = Days(this.toLong())

val Int.years: TimeTemporal
    get() = Years(this.toLong())

val Int.months: TimeTemporal
    get() = Months(this.toLong())

