package bolum2

fun main(args: Array<String>) {
    var name:String? = "Mehmet"
    //name = null

    //var surname:String = null//Bu kullanım hata verir.

    println("$name de karakter sayısı : ${name?.length}")

    println("$name de karakter sayısı : ${name!!.length}")

}