package bolum11

fun main(args: Array<String>) {
    println("5 elemanlı bit dizi oluşturmak için verileri giriniz")

    var array = Array<Int>(5) {0}

    var index: Int = 0

    do {

        print("array[$index]:")

        var value: Int = readLine()!!.toInt()

        array.set(index, value)

        index++

    } while (index < array.size)

    array.sort()

    println("Girilen dizi elemanları")

    for (i in 0..array.size-1){
        println("array[$i]:"+array[i])
    }
}