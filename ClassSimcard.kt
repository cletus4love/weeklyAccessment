fun main() { 
var myname: SimCard = SimCard ("Glo") name.company ("Globacom") 
myname.setserialNo (444455566) println(myname.getserialNo ()) } 
} 
Class SimCard{
public var name: String = "" 
public  var type: String= ""
public  var package: String = ""
private  var serialNo: Int= 0
public  var dateExpiry:String = ""
} 
constructor(name: String, type: String, package : String, serialNo:Int, dateExpiry: String ){ 
this.name = name 
this.type = type
this.package = package 
this.serialNo = serialNo
this.dateExpiry = dateExpiry
} 
serialNo property fun getserialNo() : Int{ return this.serialNo  } 
fun setserialNo(serialNo  : Int){ this.serialNo  = serialNo  } }