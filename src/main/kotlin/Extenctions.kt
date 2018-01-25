import java.time.LocalDateTime
import java.time.ZonedDateTime

infix fun LocalDateTime.atZone(id: String): ZonedDateTime {
    return this.atZone(java.time.ZoneId.of(id))
}
