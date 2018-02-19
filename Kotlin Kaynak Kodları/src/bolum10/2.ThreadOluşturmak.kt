package bolum10

fun main(args: Array<String>) {
    var thread = NewThread()
    thread.start()
}

class NewThread:Thread(){
    override fun run() {
        println("Yeni iş parçası")
    }
}