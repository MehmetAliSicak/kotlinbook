package bolum3

fun main(args: Array<String>) {
    //VE &&

    println("VE Operatörü")
    println(false && false)
    println(false && true)
    println(true && false)
    println(true && true)

    var a:Int = 5
    var b:Int = 6
    println(a==5 && b==6)


    //VEYA ||

    println("VEYA Operatörü")
    println(false || false)
    println(false || true)
    println(true || false)
    println(true || true)


    println(a==5 || b!=6)

    //DEĞİL !
    println("DEĞİL Operatörü")
    println(!false)
    println(!true)

}
