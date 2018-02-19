package bolum7

var globalNumber = 25

fun fun1():Unit{
    var localNumber = 30
    println("fun1-global değişken:$globalNumber")
    println("fun1-local değişken:$localNumber")
}

fun fun2():Unit{
    println("fun2-global değişken:$globalNumber")

}

fun main(args: Array<String>) {
    println("main-global değişken:$globalNumber")
    fun1()
    fun2()
}
