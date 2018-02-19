package bolum8

/*public, private, protected, internal*/

open class Visibility{

    private val PI:Double = 3.14

    protected val number:Double = 3.14556565
    internal var name:String = "Mehmet"

}

class Visibility2:Visibility(){
    fun showInfo(){
        println(this.number)
    }
}
fun main(args: Array<String>) {
    var obj = Visibility2()
    println(obj.showInfo())
    println(obj.name)
}