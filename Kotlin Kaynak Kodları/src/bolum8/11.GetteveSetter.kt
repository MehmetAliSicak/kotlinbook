package bolum8

class GetterSetter {
    var number: Int = 0
        get() = field
        set(value) {
            if (value%2 == 0){
                field = value
            }
        }
}

fun main(args: Array<String>) {
    var obj = GetterSetter()
    println("Sayı giriniz:")
    obj.number = readLine()!!.toInt()
    println(obj.number)
}