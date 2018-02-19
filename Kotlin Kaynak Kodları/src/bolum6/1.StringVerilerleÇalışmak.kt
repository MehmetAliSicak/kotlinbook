package bolum6

fun main(args: Array<String>) {
    var x: String = "15"
    var y: String = "5"

    var sum1 = x + y
    println("$x+$y=" + sum1)

    var sum2 = x.toInt() + y.toInt()
    println("$x+$y=" + sum2)

    var v1 = "Kotlin"
    println("$v1 kelimesinde ${v1.length} karakter var")
    for (i in 0..v1.length-1){
        println(v1[i])
    }
}
