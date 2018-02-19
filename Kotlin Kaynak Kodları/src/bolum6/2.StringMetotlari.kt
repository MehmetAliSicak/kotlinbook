package bolum6

fun main(args: Array<String>) {
    //trim: string verinin başında ve sonunda bulunan boşlukları siler.
    var v1 = "     Kotlin Programlama Dili     "
    println(v1)
    println(v1.trim())

    //toLowerCase: tüm karakterleri küçültür.
    //toUpperCase: tüm karakterleri büyütür.

    var v2 = "Kotlin PROGRAMLAma DiLi"
    println("toLowerCase:"+v2.toLowerCase())
    println("toUpperCase:"+v2.toUpperCase())

    //split: bu komut ile belirlediğiniz karakterden itibaren string veri parçalanır.

    var v3 = "Kotlin Programlama Dili"

    println(v3.split(" "))
    println(v3.split("a"))
    var v4 = v3.split("o")
    println("$v4 dizisinde ${v4.size}")
    println(v4[2])


















}
