# datesugar
Kotlin DateTime syntactic sugar utilities

examples: 

```Kotlin
    val d = dateOf(2018,2,1) + 6.days + 3.months
    println(d)
```

and the output would be: 

```
2018-05-07
```
another example:

```kotlin
    val nyt = dateTimeOf(1992,month = 5,dayOfMonth = 7) atZone "America/New_York"
    println(nyt)
```
output:

```
1992-05-07T00:00-04:00[America/New_York]
```


```kotlin
    var t = "2017-11-01".toDate() + 2.days
    println(t)
```
output:

```
2017-11-03
```
