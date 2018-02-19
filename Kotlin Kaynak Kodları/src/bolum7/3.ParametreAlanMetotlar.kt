package bolum7

import java.util.*


fun showMessage1(comingMessage: String): Unit {
    println(comingMessage)
}

fun sumComingNumber(x: Double, y: Double): Double {
    return x + y
}

fun getHMS():String{
    val calendar = Calendar.getInstance()

    var hour = calendar.get(Calendar.HOUR)
    var minute = calendar.get(Calendar.MINUTE)
    var second = calendar.get(Calendar.SECOND)

    return "$hour:$minute:$second"
}

fun findMaxNumber(x:Int,y:Int):Int{
    if (x>y){
        return x
    }else{
        return y
    }
}


fun main(args: Array<String>) {
    /*print("Mesaj Giriniz:")
    var message: String = readLine()!!

    showMessage1(message)*/

    /*print("1.sayı:")
    var number1:Double = readLine()!!.toDouble()

    print("2.sayı:")
    var number2:Double = readLine()!!.toDouble()

    var sum:Double = sumComingNumber(number1,number2)
    println("girilen sayıların toplamı:$sum")*/

    //println("Şu anki saat bilgisi:${getHMS()}")

    /*print("1.sayı:")
    var number3:Int = readLine()!!.toInt()

    print("2.sayı:")
    var number4:Int = readLine()!!.toInt()


    println("girilen sayılardan ${findMaxNumber(number3,number4)} daha büyüktür")*/

    /*var comingList:List<String> = buildList()
    for (item in comingList){
        println(item)
    }*/

    print(power())


}

fun power(x:Double=2.0, y:Double=5.0): Double {
    return Math.pow(x,y)//2^5 = 32
}


fun buildList():List<String>{
    var list = listOf<String>("mehmet","ali","sıcak","ramazan","enis","musa","mahmut")
    return list
}