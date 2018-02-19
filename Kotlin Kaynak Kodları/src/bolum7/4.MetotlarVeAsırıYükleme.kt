package bolum7

fun mix(x:Int):Int{
    return x
}

fun mix(x:Int,y:Int):Int{
    return x + y
}

fun mix(x:Int,y:Int,z:Int):Int{
    return x + y + z
}

fun main(args: Array<String>) {
    println("mix(x):"+mix(20))
    println("mix(x,y):"+mix(20,10))
    println("mix(x,y,z):"+mix(20,10,25))
}