package bolum7

//Unit'in Java'daki karşılığı Void ifadesidir.
fun showMessage():Unit{
    println("Merhaba ben ilk metot")
}

fun sumFun():Unit{
    var sum = 0
    for(i in 1..100){
        sum += i
    }
    println("1 ile 100 arasındaki sayıların toplamı:$sum")

}

fun sendMessage():String{
    return "Değer döndüren ama parametre almayan metottan bir mesaj"
}

fun main(args: Array<String>) {
    showMessage()
    sumFun()
    println(sendMessage())
}
