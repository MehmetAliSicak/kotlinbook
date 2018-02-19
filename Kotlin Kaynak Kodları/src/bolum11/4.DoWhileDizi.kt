package bolum11

fun main(args: Array<String>) {

    println("5 elemanlı bit dizi oluşturmak için verileri giriniz")

    var array = Array<String>(5) { "" }

    var index: Int = 0

    do {

        print("array[$index]:")

        var value: String = readLine()!!.toString()

        array.set(index, value)

        index++

    } while (index < array.size)

    println("Girilen dizi elemanları")

    for (i in 0..array.size-1){
        println("array[$i]:"+array[i])
    }
}
