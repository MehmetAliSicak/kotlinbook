package bolum6

fun main(args: Array<String>) {
    //Array, ArrayList ve arrayOf
    /*println("Array ile Dizi Oluşturmak")
    val numbers = Array<Int>(5){0}

    println("Dizinin Elemanları")

    numbers[2] = 25

    for (index in 0..numbers.size-1){
        print("numbers[$index].Elemanı Giriniz:")
        numbers[index] = readLine()!!.toInt()
    }

    for (i in 0..numbers.size-1){
        println("numbers[$i]:"+numbers[i])
    }
*/
    /*println("ArrayList ile Dizi Oluşturmak")

    var name = ArrayList<String>()

    name.add("musa")
    name.add("kadir")
    name.add("mahmut")

    name.set(0,"ali")
    for (str in name){
        println(str)
    }

    if (name.contains("Mahmut")){
        println("mahmut dizide bulunyor")
    }else{
        println("mahmut dizide bulunmuyor")
    }
*/

    println("arrayOf ile Dizi Oluşturmak")

    var mix = arrayOf("Kotlin",17,'a',20.5,"Java")

    for (i in 0..mix.size-1){
        println("mix[$i]:"+mix[i])
    }
    /*println("mix[3]:"+mix[3])

    mix[3] = 25

    println("mix[3]:"+mix[3])*/
    /*intArrayOf()
    charArrayOf()
    doubleArrayOf()
    floatArrayOf()*/




















}