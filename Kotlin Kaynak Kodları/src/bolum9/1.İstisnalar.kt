package bolum9

fun main(args: Array<String>) {
    /*print("1.sayıyı giriniz:")
    var number1:Int = readLine()!!.toInt()

    print("2.sayıyı giriniz:")
    var number2:Int = readLine()!!.toInt()

    var result:Double = (number1/number2).toDouble()

    println("Sonuç:"+result)*/

    var numbers = Array<Int>(5){0}

    numbers[0] =15
    numbers[1] =-5
    numbers[2] =25
    numbers[3] =23
    numbers[5] =4

    for (i in 0..numbers.size-1){
        println("numbers[$i] : " + numbers[i])
    }

}
