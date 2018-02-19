package bolum8

class User(var userName:String,var password:String){
    override fun toString(): String {
        return "userName = $userName, password = $password"
    }
}

data class UserData(var userName:String,var password:String){

}

fun main(args: Array<String>) {
    var objUser = User("Mehmet","12345")
    var objUser2 = User("Mehmet","12345")
    var objUser3 = User("Ramazan","7898787")

    var mapClass = setOf(objUser,objUser2,objUser3)

    println(mapClass)

    var objUserData = UserData("Mehmet","12345")
    var objUserData2 = UserData("Mehmet","12345")
    var objUserData3 = UserData("Musa","5656565")

    var mapDataClass = setOf(objUserData,objUserData2,objUserData3)
    println(mapDataClass)


    /*println("Normal sınıflarda equal Sonucu:"+objUser.equals(objUser2))
    println("Data sınıflarda equal Sonucu:"+objUserData.equals(objUserData2))*/

    /*var newUserData = objUserData.copy(userName = "Ramazan Enis",password = "8985656")
    println(newUserData)*/

    /*var objUserData = UserData("Mehmet","12345")
    var(userName,password) = objUserData
    println("UserName:"+userName)
    println("password:"+password)*/

}