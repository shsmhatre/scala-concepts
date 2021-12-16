/**
 * Constructor overloading example
 */

object MultipleConstructor extends App{
    var company = new Company("Bridgelabz")
    var company1 = new Company("Bridgelabz", "2010")

    var company2 = new Company("Bridgelabz", "2010", 200)



}

class Company(name: String, yearEstablished: String, size: Int) {
    def this(name:String) {
      this(name, "", 0)
      println("Constructor with single parameter")
    }
    def this(name:String, yearEstablished:String) {
      this(name, yearEstablished, 0)
      println("Constructor with 2 parameter")
    }
    /*
    def this(name:String, yearEstablished:String, size:Int) {
        this(name, yearEstablished, size)
        println("Constructor with 3 parameter")
    }
     */
}