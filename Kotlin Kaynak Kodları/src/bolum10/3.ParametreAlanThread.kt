package bolum10

fun main(args: Array<String>) {
    print("Veri giriniz:")
    var value:String = readLine()!!

    var thread = NewThread1(value)
    thread.start()
}

class NewThread1() : Thread() {
    var comingData: String = ""

    constructor(comingData: String) : this() {
        this.comingData = comingData
    }

    override fun run() {
        for (i in comingData){
            if (i == 'l')this.stop()
            println(i)
        }
    }
}