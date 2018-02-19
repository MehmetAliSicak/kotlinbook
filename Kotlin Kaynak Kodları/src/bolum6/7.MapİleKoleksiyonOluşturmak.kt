package bolum6

fun main(args: Array<String>) {
    /*Map
    immutable(değiştirilmeyen): mapOf()
    Mutable(değiştirilebilen): hashMapOf() ve mutableMapOf()*/

    /*mapOf()*/

    /*var map = mapOf<Int, String>(15 to "mehmet",
                                 20 to "ali",
                                 30 to "sıcak")
    //println("key bilgisi 20 olan veri:"+map.get(20))

    /*for (str in map){
        println(str)
        println(str.value)
    }*/

    print("Aramak için bir veri giriniz")
    var data :String = readLine()!!

    if (map.containsValue(data)){
        println(data+" verisi map içinde bulundu")
    }else{
        println(data+" verisi map içinde bulunmadı")
    }*/

    /*hashMapOf()*/

    /*var hashmap = hashMapOf<String, String>("15" to "mehmet",
                                            "20" to "ali",
                                            "30" to "sıcak")*/

    /*println(hashmap["30"])
    hashmap.set("30","mahmut")
    println(hashmap.get("30"))*/

    /*println("remove metodundan önce hashmap")
    for (str in hashmap){
        println(str)
    }

    //hashmap.put("40","ramazan")
    hashmap.remove("20")
    println("remove metodundan sonra hashmap")
    for (str in hashmap){
        println(str)
    }*/

    var mutable = mutableMapOf<Char,Int>()
    mutable.put('x',24)
    mutable.put('y',12)
    mutable.put('z',21)


}
