package bolum4

fun main(args: Array<String>) {
    var age: Int = 14

    var result = if (age > 16) {
        println("Yaşınız 16'dan büyüktür")
        "M, A1 ve B1 sürücü belgelerini alabilir"
    } else {
        println("Yaşınız 16'dan küçüktür.")
        "Herhangi bir belge alamazsınız"
    }
    println(result)

    var number:Int = 50

    var result1=if (number in 45..55){
        true
    }else{
        false
    }

    println("result1:"+result1)

    var number1:Int = 44

    var result2=if (number1 in 45..55){
        println("$number1 sayısı 45 ile 55 arasında")
        1
    }else{
        println("$number1 sayısı 45 ile 55 arasında değil")
        0
    }

    println("result2:"+result2)
}
