import java.util

/**
 * Whenever you create a new class you need to define parameters, so you are bounded to a specific type
 * Instead of being bounded to single type we can make a class Generic by adding a [] with any value
 * such as T to represent that this generic class will only define a type when it is instantiated
 */
class NonGenericClass {
    def printParam(param : Int) ={
        println(s"This is the param : ${param}")
    }
}

object GenericsExample extends App {
     var nonGenericClass = new NonGenericClass
     nonGenericClass.printParam(3) //it works as we pass integer value
     //nonGenericClass.printParam(3.0) //it does not work as we pass double value
     //To allow different type values we created generic class below
    var genericClassInt = new GenericClass[Int]
    genericClassInt.printParam(3)

    var genericClassDouble = new GenericClass[Double]
    genericClassDouble.printParam(3.0)

    var genericClassString = new GenericClass[String]
    genericClassString.printParam("Suhas")

    var book = Books("Abc")
    println("Book details:" +book.getBookDetails())

    var book2 = Books("PQR")
    println("Book details:" +book2.getBookDetails())
}

class GenericClass[T] {
    def printParam(x: T) = {
        println(s"The param is : ${x}")
    }
}

case class Books(name:String) {
    def getBookDetails() = {
        name
    }
}