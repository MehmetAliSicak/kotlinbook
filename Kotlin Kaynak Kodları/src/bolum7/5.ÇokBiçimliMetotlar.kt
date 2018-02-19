package bolum7

fun showInformation(name:String):Unit{
    println("İsminiz:$name")
}

fun showInformation(age:Int):Unit{
    println("Yaşınız:$age")
}

fun showInformation(birth:Long):Unit{
    println("Doğum Tarihiniz:$birth")
}

fun main(args: Array<String>) {
    showInformation("mehmet ali sıcak")
    showInformation(30)
    showInformation(1986)
}