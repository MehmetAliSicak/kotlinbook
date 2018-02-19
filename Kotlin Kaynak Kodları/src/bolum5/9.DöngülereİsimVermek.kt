package bolum5

fun main(args: Array<String>) {

    loopname@ for (i in 4..6) {
        for (j in 1..3) {
            if (i*j == 12) break@loopname
            println("$i*$j =" + (i * j))
        }
    }

}
