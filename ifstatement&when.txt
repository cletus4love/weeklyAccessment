
fun main(args: Array<String>) {

    var a = 4
    var b = 5

    var max = a
    if (a < b)
        max = b

    if (a > b) {
        max = a
    } else {
        max = b
    }

    println("a is $a b is $b max is $max")

    a = 5
    b = 4


    //if else returns a value in Kotlin
    max = if (a > b) a else b

    println("a is $a b is $b max is $max")


    max = if(a>b)
    {
        println("a is greater than b")
        println("max is a")
        a
    }
    else{
        println("b is greater than a")
        println("max is b")
        b
    }

    println("max is $max")

    val items = listOf(10, 20, 30, 40)

    for ((i,e) in items.withIndex())
        println("index is $i and element is $e")

    (2..5).forEach{
        print(it)
    }

    var x = 5

    if(x in 10 downTo 1)
    {
        print("x exists in range")
    }
    else{
        print("x does not exist in range")
    }

    var i = 0
    do {
        i+=5
        println("Value of i is $i")
    } while(i<1)


    i=0
    while(i<=5) {
        print(i)
        i++
    }


    customLabel@ for(y in 10 downTo 5) { // appling the custom label
        if(y == 6) {
            print("x is $y breaking here")
            break@customLabel //specifing the label
        } else {
            print("continue to next iteration")
            continue@customLabel
        }
    }

    repeat(3) {
        println("Hello World!")
        println("Kotlin Control Flow")
    }

    var num = 10
    when (num) {
        0 -> print("value is 0")
        5 -> print("value is 5")
        else -> {
            print("value is neither 0 nor 5")
        }
    }

    var valueLessThan100 = when(101){
        in 1 until 101 -> true
        else -> {
            false
        }
    }

    print(valueLessThan100) //false


    month(1)
    month("MAR")


}

fun month(month: Any)
{
    when(month)
    {
        1 -> print("January")
        2-> print("February")
        "MAR" -> print("March")
        else -> { print("Any other month or it is invalid. when operator takes generic type Any") }
    }
}

