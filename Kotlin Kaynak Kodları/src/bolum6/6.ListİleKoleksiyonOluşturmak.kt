package bolum6

fun main(args: Array<String>) {
    /*
    List
    immutable(değiştirilmeyen): listOf() ve listOfNotNull()
    Mutable(değiştirilebilen): arrayListOf() ve mutableListOf()*/

    /*listOf()*/

    /*var mix = listOf(2, 3, "mahmut", "musa", 20.5, "ramazan", null, false)

    var max = mix.size-1

    var i = 0

    println("Liste Elemanları")
    while (i<=max){
        println("mix[$i]:"+mix[i])
        i++
    }*/

/*
    var n1:Int = mix[0] as Int
    var n2:Int = mix[1] as Int

    var sum = n1 + n2
    println("sum:"+sum)*/
    //println("mix[3]:"+mix[3])

    /*listOfNotNull()*/
    /*var mix2 = listOf(2, 3, "mahmut", "musa", 20.5, "ramazan", null, false)
    println("mix2 eleman sayısı:"+mix2.size)

    var mix3 = listOfNotNull(2, 3, "mahmut", "musa", 20.5, "ramazan", null, false)
    println("mix3 eleman sayısı:"+mix3.size)*/

    /*arrayListOf() ve mutableListOf()*/
    var mix4 = arrayListOf(2, 3, "mahmut", "musa", 20.5, "ramazan", null, false)

    mix4.set(2,"ali")
    mix4.add("Java")
    mix4.remove(20.5)
    for (i in 0..mix4.size-1){
        println("mix4[$i]:"+mix4[i])
    }

    var mix5 = mutableListOf(2, 3, "mahmut", "musa", 20.5, "ramazan", null, false)

}
