package bolum9

fun main(args: Array<String>) {

    /*var name: String? = "Mehmet"

    //var nameLength: Int = if (name != null) name.length else 0

    var nameLength:Int = name?.length ?: 0

    println("Uzunluk:"+nameLength)*/

    /*var name: String? = "Mehmet"
    try {
        var result = name?.length ?: throw IllegalArgumentException("name içinde null değer var")
        println("Sonuç:"+result)
    }catch (ex:IllegalArgumentException){
        println("Hata meydana geldi:"+ex.toString())
    }*/

    var name: String? = "Ramazan"
    var result = name?.length ?: failFun("name içinde null değer var")
    println("Sonuç:"+result)
}

fun failFun(message:String):Nothing{
    throw IllegalArgumentException(message)
}
