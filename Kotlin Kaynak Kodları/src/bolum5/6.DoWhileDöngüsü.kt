package bolum5

import java.util.*

fun main(args: Array<String>) {

    var rnd:Int = Random().nextInt(20) + 1
    var i = 0

    var sum = 0

    do {
        sum += i
        i++

    }while (i<=rnd)

    println("1 ile $rnd arasındaki sayıların toplamı:$sum")

}
