package bolum6

fun main(args: Array<String>) {
    /*Set
    immutable(değiştirilmeyen): setOf()
    Mutable(değiştirilebilen): mutableSetOf()
    */

    /*var mix = setOf(23,22,56,"mehmet",null,20.8f,false,22)
    for (i in mix){
        println(i)
    }*/
    //println(mix)

    var mix1 = mutableSetOf(23,22,56,"mehmet",null,20.8f,false)
    /*println("add metodundan önce")
    println(mix1)

    mix1.add('X')
    println("add metodundan sonra")
    println(mix1)*/

    println("remove metodundan önce")
    println(mix1)

    mix1.remove(20.8f)
    println("remove metodundan sonra")
    println(mix1)


}
