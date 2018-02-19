package bolum8

import java.awt.Color

/*Kalıtım ve Override*/

/*open class Vehicle(var mark: String, var color: String) {
    open fun showInfo() {
        println("Vehicle Sınıfında")
    }
}

class Car(mark: String, color: String) : Vehicle(mark, color) {

}*/

/*Abstract ve Override*/

/*abstract class Vehicle(var mark: String, var color: String) {
    abstract fun showInfo()
}

open class Car(mark: String, color: String) : Vehicle(mark, color) {
    override final fun showInfo() {
        println("Aracın markası $mark, rengi $color")
    }
}

class Motorcycle():Car("Honda","Kırmızı"){

}*/

/*Interface ve Override*/
/*interface  Vehicle {
    var mark:String
    var color:String
    fun showInfo()
}

class Car(override var mark: String, override var color: String):Vehicle{
    override fun showInfo() {
        println("Aracın markası $mark, rengi $color")
    }
}*/

/*super() ve Override*/

/*interface Vehicle{
    fun showInfo(){
        println("Vehicle arayüzünde showInfo() metodu")
    }
}

abstract class Vehicle2{
    open fun showInfo(){
        println("Vehicle2 sınıfında showInfo() metodu")
    }
}
class Car():Vehicle,Vehicle2(){
    override fun showInfo() {
        super<Vehicle2>.showInfo()
        println("Car sınıfında showInfo() metodu")
    }
}*/

/*toString() ve Override*/

class Car(var mark: String, var color: String){
    override fun toString(): String {
        return "Araç bilgileri: $mark, $color"
    }
}

fun main(args: Array<String>) {
    var carObj = Car("Opel","Siyah")
    print(carObj)
}