package bolum5

fun main(args: Array<String>) {
    for (i in 1..10){

        println(i)

        if (i == 7)
            break
    }

    println("Break Komutu")

    for (char in "Mehmet@Ali"){
        if (char == '@') break
        print(char)
    }
}
