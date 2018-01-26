# datesugar
Kotlin syntactic sugar for java.time.

#Usage

* using dateOf to create LocalDate: 

```Kotlin
    val d = dateOf(2018,2,1) + 6.days + 3.months
    println(d)
```

and the output would be: 

```
2018-05-07
```
* using dateTimeOf to create LocalDateTime and then atZone to retrieve a ZonedDateTime:

```kotlin
    val nyt = dateTimeOf(1992,month = 5,dayOfMonth = 7) atZone "America/New_York"
    println(nyt)
```

```
1992-05-07T00:00-04:00[America/New_York]
```
* using toDate String extension and days Int extension property with plus operator overloading

```kotlin
    var t = "2017-11-01".toDate() + 2.days
    println(t)
```

```
2017-11-03
```

* using range extension

```kotlin
    val startDate = LocalDate.now() - 2.years
    val endDate = LocalDate.now()
    println(dateOf(2010) in startDate..endDate)
```

```kotlin
false
```

* using lastDayOfMonth extension method

```kotlin
    println(dateOf(2018,2,1).lastDayOfMonth())
```

```
28
```
