package bolum5

fun main(args: Array<String>) {
    for (i in 1..10) {

        if (i == 7) {
            continue
        }

        println(i)
    }

    println("Continue Komutu")

    for (char in "Mehmet@Ali"){
        if (char == '@'){
            print(" ")
            continue
        }
        print(char)
    }
}
