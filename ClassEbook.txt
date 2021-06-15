fun main() { 
var mytitle: Ebook = Ebook("Bingo",2, "dom@gailcom",0706883757,"youcome22") 
 mytitle.password  ("youcome22") println(mytitle .getpassword  ()) 
 }
class Ebook {
public var title: String = "" 
public var volume: Int = 0
public var email: String = ""
public var phoneNo: Int= 0
private var password:String = ""
} 
constructor(title: String, volume: Int, email: String, phoneNo:Int, password: String ){ 
this.title = title 
this.volume = volume
this.email = email
this.phoneNo = phoneNo
this.password = password
} 
password  property fun getpassword() : Int{ return this.password   } 
fun password (password  : Int){ this.password   = password   } }