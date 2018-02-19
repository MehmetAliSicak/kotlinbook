package bolum8

class Book(name: String, page: Int, author: String, publisher: String) {
    var name: String
    var page: Int
    var author: String
    var publisher: String

    init {
        this.name = name
        this.page = page
        this.author = author
        this.publisher = publisher

        println("*****Kitap Bilgileri*****")
        println("Kitap:$name")
        println("Sayfa:$page")
        println("Yazar:$author")
        println("Yayınevi:$publisher")
    }
}


class Circle(r:Double,PI:Double = 3.14){
    init {
        println("Çevre:${2 * PI * r}")
    }
}

fun main(args: Array<String>) {
    /*var obj:Book = Book("Android Programlama ve Uygulama Rehberi",
            1160,
            "Mehmet Ali SICAK",
            "Level Kitap")

    var obj2:Book = Book(
            page = 400,
            name = "Kotlin",
            publisher = "Level Kitap",
            author = "Mehmet Ali SICAK"
            )*/

    var circleObj = Circle(8.0,3.0)


}