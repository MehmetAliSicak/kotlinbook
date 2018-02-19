package bolum7

fun showInfo():Unit{
    println("Metotlar hakkında")
}

//Int,Double,Float,Char,String,List,Date,Boolean
fun showInfo2():Int{
    return 3
}

fun showInfo3(message:String){
    println(message)
}

fun myAge() = 30

fun main(args: Array<String>) {
    showInfo()
    println(showInfo2())
    println(showInfo3("Merhaba ben Kotlin"))
    println(myAge())


}
