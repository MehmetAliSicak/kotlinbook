package bolum5

fun main(args: Array<String>) {
    println("**1 ile 10 arasındaki sayılar***")

    var i:Int = 1
    while (i<=10){
        println(i)
        i++
    }

    println("i'nin son değeri:"+i)

    println("**10 ile 1 arasındaki sayılar***")

    i = 10
    while (i>=1){
        println(i)
        i--
    }

    println("**1 ile 10 arasındaki ÇİFT sayılar***")

    i=1
    while (i<=10){

        if(i % 2 == 0){
            println(i)
        }

        i++
    }

    println("**1 ile 100 arasındaki ÇİFT sayıların toplamı***")

    i=1
    var sum = 0
    while (i<=100){

        if(i % 2 == 0){
            sum += i//sum = sum + i
        }

        i++
    }
    println("**1 ile 100 arasındaki ÇİFT sayıların toplamı: $sum")
}
