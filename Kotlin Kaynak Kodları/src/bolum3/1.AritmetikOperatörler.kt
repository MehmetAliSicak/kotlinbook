package bolum3

fun main(args: Array<String>) {
    // aritmetik operatörler: +, -, *, / ve %

    var number1: Int = 18
    var number2: Int = 7
    var result: Int

    result = number1 + number2
    println("$number1 + $number2 = " + result)

    result = number1 - number2
    println("$number1 - $number2 = " + result)

    result = number1 * number2
    println("$number1 * $number2 = " + result)

    result = number1 / number2
    println("$number1 / $number2 = " + result)

    result = number1 % number2
    println("$number1 % $number2 = " + result)
}