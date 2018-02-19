package bolum8

/*fun multiVariable(vararg values:String):Unit{
    for (string in values){
        println(string)
    }
}*/


class MixDataType<E>(vararg var values: E) {

    var list = values.toMutableList()

    fun addData(value:E) {
        list.add(value)
    }

    fun getData() {
        for (item in list){
            println(item)
        }
    }

    fun removeData(index:Int):E {
        return list.removeAt(index)
    }
}

fun <T> mixOf(vararg values:T):MixDataType<T>{
    return MixDataType(*values)
}



fun main(args: Array<String>) {

    var obj = mixOf("Merhaba","Güle Güle","Günaydın","İyi Akşamlar","İyi Geceler")
    obj.getData()
    /*var obj = MixDataType(12,false,'x',"Mehmet",20.5f,3.14)
    println("Eleman sayısı:"+obj.list.size)

    print("Yeni değer giriniz:")
    obj.addData(readLine()!!)

    obj.getData()

    print("Listeden veri silmek için 0 ile ${obj.list.size-1} arasında bir değer giriniz.")
    var index:Int = readLine()!!.toInt()
    if (index in 0..obj.list.size-1){
        println("Silinen veri:"+obj.removeData(index))
    }else{
        println("Yanlış bir değer girdiniz")
    }*/


    //multiVariable("Ramazan Enis","Mahmut","Kadir","Musa","Esma")
}
