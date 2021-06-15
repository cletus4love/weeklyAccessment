fun main(){ 
var myAccount : BankAccount = BankAccount(10000000.3, 121322334,"Jagboma", "Saving","June 13th") myAccount.setAccountBalance(432.2) println(myAccount.getAccountBalance()) } 
Class BankAccount{ 
private var accountBalance : Double = 0.0 private var bvn : Int = 0 
public  var name : String = ""
public  var accountType: = ""
private var date:String = ""
constructor(accountBalance : Double, bvn : Int, name:String, accountType: String, date:String ){ 
this.accountBalance = accountBalance 
this.bvn = bvn
this.name = name
this. accountType = accountType 
this.date = date
} 
accountBalance property fun getAccountBalance() : Double{ return this.accountBalance } 
fun setAccountBalance(accountBalance : Double){ this.accountBalance = accountBalance } }