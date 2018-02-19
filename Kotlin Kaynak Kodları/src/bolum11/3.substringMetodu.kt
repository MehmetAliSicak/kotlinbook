package bolum11

fun main(args: Array<String>) {
    print("Veri giriniz:")
    var text = readLine()!!

    if (text.length>=18) {
        println("Alınan kısım:" + text.substring(12, 18))
    }else{
        println("Karakter sayısı 18 veya daha fazla olan bir veri giriniz")
    }

}
