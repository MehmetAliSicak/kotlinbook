package bolum2

fun main(args: Array<String>) {
    print("Adınız:")
    var name : String = readLine()!!

    print("Soyadınız:")
    var surname : String = readLine()!!

    print("Yaşınız:")
    var age : Int = readLine()!!.toInt()

    print("Pi:")
    var pi : Double = readLine()!!.toDouble()

    println("Adınız : $name")
    println("Soyadınız : $surname")
    println("Yaşınız : $age")
    println("Pi : $pi")
}
