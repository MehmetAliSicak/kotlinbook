package bolum7

var i = 5
fun rekürsif():Unit{
    i--
    if (i>=0){
        println("rekürsif mesaj...")
        rekürsif()
    }else{
        println("******rekürsif sonu...")
    }
}

fun main(args: Array<String>) {
    rekürsif()
}
