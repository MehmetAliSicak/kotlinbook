package bolum8

class Constructor constructor(var name: String, var age: Int) {
    fun showInformation() {
        println("Ad Soyad:" + name)
        println("Yaş:" + age)
    }
}

class InitClass(name:String, age:Int){
    var comingName:String
    var comingAge:Int

    init {
        this.comingName=name
        this.comingAge=age
        println("Nesne oluştu ve gelen değerler değişkene atandı.")
        println("Gelen değerler şunlardır: isim:$name, yaş:$age")
    }

    fun showInformation() {
        println("Ad Soyad:" + comingName)
        println("Yaş:" + comingAge)
    }
}

fun main(args: Array<String>) {
    /*var obj = Constructor("Musa Sıcak",18)
    obj.showInformation()*/

    var obj2 = InitClass("Mehmet Ali SICAK",30)
    obj2.showInformation()
}
