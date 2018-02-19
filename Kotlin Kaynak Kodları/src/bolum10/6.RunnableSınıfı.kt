package bolum10

fun main(args: Array<String>) {
    var t = NewThreadd()
    t.run()
}

class NewThreadd:Runnable{
    override fun run() {
        println("Merhaba bu iş parçası Runnable ile oluşturuldu")
    }
}