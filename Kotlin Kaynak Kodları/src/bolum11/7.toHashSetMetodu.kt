package bolum11

fun main(args: Array<String>) {

    print("Veri giriniz:")

    var text:String = readLine()!!.toString()

    println("length komutu")

    for (i in 0..text.length-1){
        println(text[i])
    }

    var sets = text.toHashSet()

    println("Koleksiyon elemanları")

    for (i in sets){
        println(i)
    }


}
