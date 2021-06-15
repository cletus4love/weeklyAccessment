fun main() { 
var myname: Phone = Phone("Bingo",'Y',2,43233356,"June13th") 
myname.setimielNo(43233356) println(myname.getimielNo ()) 
} 
class Phone {
public var name: String = "" 
public var series: Char = '' 
public var model: Int = 0
private var imielNo: Int= 0
public var dateExpiry:String = ""
} 
constructor(name: String, series: Char, model: Int, imielNo:Int, dateExpiry: String ){ 
this.name = name 
this.series = series
this.model = model
this.imielNo = imielNo
this.dateExpiry = dateExpiry
} 
imielNo  property fun getimielNo() : Int{ return this.imielNo    } 
fun imielNo  (imielNo   : Int){ this.imielNo    = imielNo    } }