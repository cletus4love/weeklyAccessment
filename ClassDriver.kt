fun main(args: Array<String>) {
  var myteam:Driver = Driver("liver", 201,"ese","efe","nigeria")  
  myteam .Drivernumber   (201) println(myteam  .getDrivernumber   ()) 
}
class Driver { 
public var Driveridcard: String = ""
private var Drivernumber: Int = 0
public var DriverfirstName: String = ""
public var DriverlastName: String = ""
public var Drivernationality: String= ""
 Constructor(id: String,name: String,num:Int, lname: String, nat:String) {
     this.Driveridcard = id
     this.Drivernumber = num
     this.DriverfirstName=name
     this.DriverlastName=lname
     this.Drivernationality=nat
 }
 Drivernumber property fun getDrivernumber() : Int{ return this.Drivernumber     } 
fun Drivernumber   (Drivernumber    : Int){ this.Drivernumber     = Drivernumber     } }