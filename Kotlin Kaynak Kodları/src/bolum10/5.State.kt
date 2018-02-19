package bolum10

fun main(args: Array<String>) {
    var thread = NewThread4()
    println("1-Thread State:"+thread.state)

    thread.start()
    println("2-Thread State:"+thread.state)
}

class NewThread4:Thread(){
    override fun run() {
        println("3-Thread State:"+this.state)
    }
}