package bolum2

fun main(args: Array<String>) {
    //var oneToTwenty = 1..20
    var oneToTwenty = 1.rangeTo(20)
    var newRange = oneToTwenty.step(3)
    var isTrue = 11 in newRange

    println("11 sayısı 1 ile 20 arasında mı:"+isTrue)

    //var aToz = 'a'..'z'
    var aToz = 'z'.downTo('a')

    isTrue = 'i' in aToz
    println("i karakteri a ile z arasında mı:"+isTrue)





}
