package bolum4

fun main(args: Array<String>) {
    print("Lütfen bir rakam giriniz:")
    var x:Int = readLine()!!.toInt()

    /*when(x){
        1 -> print("Girilen rakam:$x")
        2 -> print("Girilen rakam:$x")
        3 -> print("Girilen rakam:$x")
        4 -> print("Girilen rakam:$x")
        5 -> print("Girilen rakam:$x")
        else ->{
            print("1,2,3,4 ve 5 ten farklı bir rakam girdiniz.")
        }
    }*/

    when(x){
        in 1..5 -> print("Girilen rakam: $x")
        else ->{
            print("1,2,3,4 ve 5 ten farklı bir rakam girdiniz.")
        }
    }
}
