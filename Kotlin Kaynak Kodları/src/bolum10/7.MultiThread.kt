package bolum10

fun main(args: Array<String>) {
    var thread1 = NewMultiThread("1.Thread")
    var thread2 = NewMultiThread("2.Thread")
    var thread3 = NewMultiThread("3.Thread")

    thread1.start()
    thread2.start()
    thread3.start()
}

class NewMultiThread() : Thread() {
    var threadName: String = ""

    constructor(threadName: String) : this() {
        this.threadName = threadName
        println("$threadName başladı")
    }

    override fun run() {
        for (i in 0..3){
            println("$threadName --> $i")
        }
    }
}
