package bolum8

enum class Style{
    ITALIC,
    BOLD,
    UNDERLINED
}

class TextStyle(var textStyle: Style){

}

fun main(args: Array<String>) {
    var obj = TextStyle(Style.ITALIC)
    print(obj.textStyle)
    /*println("Enum Style ITALIC ---> "+Style.ITALIC)
    println("Enum Style BOLD ---> "+Style.BOLD)
    println("Enum Style UNDERLINED ---> "+Style.UNDERLINED)*/
}