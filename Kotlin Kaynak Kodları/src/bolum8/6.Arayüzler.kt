package bolum8

interface Simple {
    var name: String?
    fun showInfo()
}

class New : Simple {
    override var name: String? = null
    override fun showInfo() {
        println("Girilen değer:$name")
    }
}

fun main(args: Array<String>) {
    var obj = New()

    print("İsminizi giriniz:")
    obj.name = readLine()!!

    obj.showInfo()
}