package bolum5

fun main(args: Array<String>) {
    var name:String = "Kotlin"

    for (char : Char in name){
        println(char)
    }

    println("****Listeler***")

    var listName = listOf("Ramazan","Enis","Mehmet","Enis")
    for (name in listName){
        println(name)
    }

    println("****Setler***")

    var setName = setOf("Ramazan","Enis","Mehmet","Enis")
    for (name in setName){
        println(name)
    }

    println("****Listeler2***")

    var listName1 = listOf("Ramazan","Enis","Mehmet","Enis")
    for ((index,value) in listName1.withIndex()){
        println("$index.eleman $value")
    }

    println("****Diziler***")
    var arrayNumber = arrayOf(10,5,8,3,6)
    var sum = 0
    for (number in arrayNumber){
        sum = sum + number
    }
    println("Dizideki elemanların toplaım:$sum")

}
