package bolum6


fun main(args: Array<String>) {
    println("Değişkenler")
    var n1 = 15
    var n2 = 8
    var n3 = 13
    var n4 = 25
    var n5 = -12

    println("n1:$n1")
    println("n2:$n2")
    println("n3:$n3")
    println("n4:$n4")
    println("n5:$n5")

    println("Diziler")
    var numbers = arrayOf(15,8,13,25,-12)

    for (index in 0..numbers.size-1){
        println("numbers[$index]:"+numbers[index])
    }

}