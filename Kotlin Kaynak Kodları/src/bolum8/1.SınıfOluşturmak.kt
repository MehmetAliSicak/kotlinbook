package bolum8

class FirstClass{
    var name:String = "Ramazan Enis Sıcak"
    var age:Int = 5

    fun showInformation(){
        println("Ad Soyad:"+name)
        println("Yaş:"+age)
    }

    fun isMan():Boolean{
        return true
    }
}

fun main(args: Array<String>) {
    var obj = FirstClass()
    obj.showInformation()

    if (obj.isMan()){
        println("Bay")
    }else{
        println("Bayan")
    }
}
