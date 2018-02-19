package bolum8


abstract class MainClass {

    abstract var name: String
    abstract var age: Int

    var job: String = "Öğretmen"

    fun showInfo(){
        println("ad:$name, yaş:$age, meslek:$job")
    }

    abstract fun finish()

}

class SecondClass(override var name: String, override var age: Int) :MainClass(){

    override fun finish() {
        println("finish metodu")
    }

}


abstract class Parent{
    abstract fun showData()
}

class FirstChild:Parent(){
    override fun showData() {
        println("showData(): FirstChild")
    }
}

class SecondChild:Parent(){
    override fun showData() {
        println("showData(): SecondChild")
    }
}


fun main(args: Array<String>) {

    var obj1 = FirstChild()
    obj1.showData()

    var obj2 = SecondChild()
    obj2.showData()

















    /*var obj = SecondClass("Mehmet Ali Sıcak",30)
    obj.showInfo()
    obj.finish()*/
}



