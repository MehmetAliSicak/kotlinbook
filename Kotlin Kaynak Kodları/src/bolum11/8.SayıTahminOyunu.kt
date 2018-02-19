package bolum11

import java.util.*

fun main(args: Array<String>) {
    var rndNumber = Random().nextInt(25) + 1

    var value: Int = 0

    do {

        print("Sayı giriniz:")

        value = readLine()!!.toInt()

        if (value>rndNumber){
            println("Büyük bir değer girdiniz")
        }else if(value<rndNumber){
            println("Küçük bir değer girdiniz")
        }else{
            println("Tebrikler kazandınız. Rasgele sayımız:"+rndNumber)
            break
        }


    } while (value != rndNumber)
}
