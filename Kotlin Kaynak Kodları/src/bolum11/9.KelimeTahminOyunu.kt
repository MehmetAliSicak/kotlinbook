package bolum11

import java.util.*

fun main(args: Array<String>) {

    var words = arrayOf("Kotlin", "Programlama", "Ankara", "Java", "Paris", "Mekke")

    var index = Random().nextInt(5)

    var rndWord = words.get(index)//Ankara, Java

    //ankara --> a,n,k,r --> 4
    //java --> j,a,v --> 3
    var setRndSize = rndWord.toLowerCase().toHashSet().size

    var count = 0

    var comingChar = mutableSetOf<Char>()

    do {

        print("Karakter Giriniz:")
        var char = readLine()!!

        if (rndWord.toLowerCase().contains(char.toLowerCase())){

            comingChar.add(char[0].toLowerCase())
            count++

        }else{

            println("Yanlış tahmin bir daha deneyiniz")
            continue

        }

        for (i in rndWord.toLowerCase()){
            if (comingChar.contains(i)){
                print(i + " ")
            }else{
                print("_")
            }
        }

        if (count == setRndSize){
            println("Tebrikler kazandınız")
            break
        }



    } while (true)

}