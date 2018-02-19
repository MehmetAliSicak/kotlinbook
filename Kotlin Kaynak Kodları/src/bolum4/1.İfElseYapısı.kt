package bolum4

fun main(args: Array<String>) {

    if (5 != 5){
        println("Evet doğru")
    }else{
        println("Hayır yanlış")
    }

    println("Program sonu")

    var age : Int = 17
    if (age < 18){
        if (age > 16){
            println("M, A1 ve B1 sürücü belgelerini alabilir")
        }else{
            println("Herhangi bir belge alamazsınız")
        }
    }
}
