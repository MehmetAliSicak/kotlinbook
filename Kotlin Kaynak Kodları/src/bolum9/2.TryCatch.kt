package bolum9

fun main(args: Array<String>) {

    /*print("1.sayıyı giriniz:")
    var number1:Int = readLine()!!.toInt()

    print("2.sayıyı giriniz:")
    var number2:Int = readLine()!!.toInt()

    try {
        var result:Double = (number1/number2).toDouble()

        println("Sonuç:"+result)
    } catch (ex: Exception) {
        println("2.sayıya sıfır değeri girilemez")
    }*/

    /*var numbers = Array<Int>(5){0}

    numbers[0] =15
    numbers[1] =-5
    numbers[2] =25
    numbers[3] =23


    try {
        numbers[4] =4
    }catch (ex:Exception){
        println("Hata Meydana Geldi:"+ex.toString())
    }finally {
        println("Finally kod bloğu. Merhaba bu satır her zaman için yazılır.")
    }


    for (i in 0..numbers.size-1){
        println("numbers[$i] : " + numbers[i])
    }*/

    print("1.sayıyı giriniz:")
    var number1:Int = readLine()!!.toInt()

    print("2.sayıyı giriniz:")
    var number2:Int = readLine()!!.toInt()

    var numbers = Array<Int>(5){0}

    numbers[0] =15
    numbers[1] =-5
    numbers[2] =25
    numbers[3] =23

    try {
        numbers[4] =4

        var result:Double = (number1/number2).toDouble()

        println("Sonuç:"+result)
    } catch (ex: ArithmeticException) {
        println("Bölme işleminde hata meydana geldi:"+ex.toString())
    }catch (ex:IndexOutOfBoundsException){
        println("Dizide hata meydana geldi:"+ex.toString())
    }
}