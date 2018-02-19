package bolum10

fun main(args: Array<String>) {
    var thread = NewThread2()
    thread.start()
    println("Thread ismi:" + thread.name)
}

class NewThread2 : Thread() {
    override fun run() {
        for (i in 0..4) {
            println("$i.Thread çalışıyor mu? : " + this.isAlive)
        }
    }
}