package bolum3

fun main(args: Array<String>) {
    var x: Int = 15
    var y: Int = 5

    var result: Int

    result = x + y * 5 - 8 // 15 + 25 - 8 = 32
    println("result = " + result)

    result = (x + y) * 5 - 8 // 20 * 5 - 8 = 92
    println("result = " + result)
}