package bolum8

open class Person(name: String, surname: String, job: String, isMan: Boolean) {
    var name: String
    var surname: String
    var job: String
    var isMan: Boolean

    init {
        this.name = name
        this.surname = surname
        this.job = job
        this.isMan = isMan
        println("<------Nesne Oluştu------>")
    }

    fun showInfo() {
        println("*****Kişi Bilgileri******")
        println("Ad:$name")
        println("Soyad:$surname")
        println("Meslek:$job")
        if (isMan) {
            println("Cinsiyet:Bay")
        }else{
            println("Cinsiyet:Bayan")
        }
    }
}

class Teacher(name: String, surname: String, job: String, isMan: Boolean):Person(name, surname, job, isMan) {

}

open class TopClass(){
    open fun hello(){
       println("Merhaba bu mesaj ÜST sınıftan geliyor")
    }
}

open class SubClass:TopClass(){
    override fun hello() {
        println("Merhaba bu mesaj ALT sınıftan geliyor")
    }

    open fun finish(){
        println("Güle güle")
    }
}

class LastClass:SubClass(){
    override fun hello() {
        println("Merhaba bu mesaj SON sınıftan geliyor")
    }

    override fun finish() {
        println("Güle güle bu mesaj SON sınıftan geliyor")
    }
}

fun main(args: Array<String>) {

    var obj1 = TopClass()
    obj1.hello()

    var obj2 = SubClass()
    obj2.hello()
    obj2.finish()

    var obj3 = LastClass()
    obj3.hello()
    obj3.finish()









    /*var obj = Person("Mehmet Ali","Sıcak","Öğrenci",true)
    obj.showInfo()

    var obj2 = Teacher("Musa","Sıcak","Öğretmen",true)
    obj2.showInfo()*/
}


