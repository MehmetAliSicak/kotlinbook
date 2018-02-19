package bolum11

fun main(args: Array<String>) {

    print("Veri giriniz:")

    var text:String = readLine()!!.toString()

    println("length komutu")

    for (i in 0..text.length-1){
        println(text[i])
    }

    var chars = text.toCharArray()

    println("Char dizi elemanları")

    for (i in 0..chars.size-1){
        println(chars.get(i))
    }


}
