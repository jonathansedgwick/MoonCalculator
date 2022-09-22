import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main() {

    println("Enter date of last full moon")
    print("Month: ")
    var month = readln()!!.toInt()
    print("Day: ")
    var day = readln()!!.toInt()
    print("Year: ")
    var year = readln()!!.toInt()
    var lastMoon: LocalDate = LocalDate.of(year, month, day)

    var today = LocalDate.now()

    lastMoon.plusDays(29)
    var todaysUntil = lastMoon.until(today, ChronoUnit.DAYS)
    print("There are $todaysUntil days until the next full moon")

}