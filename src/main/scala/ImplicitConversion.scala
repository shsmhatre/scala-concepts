/**
 * Implicit conversion is the ability to convert one type into another
 *

 */
object ImplicitConversion  extends  App {
    val number : Double = 1.2
    val centimeters: Centimeters = Meters(number)
    implicit def meters2Centimeters(meters: Meters) : Centimeters = Centimeters(meters.value * 100)

    //implicit def meters2Centimeters2(meters: Meters) : Centimeters = Centimeters(meters.value * 1000)
    println(s"Centimeters of ${number} meters is : ${centimeters}")
    implicit def kilometers2Meters(kilometers: Kilometers) : Meters = Meters(kilometers.value * 1000)
    val meters:  Meters = Kilometers(number)
    println(s"Meters of ${number} kilometers is : ${meters}")

    //Limitation of Implicit conversion
    //They can not take multiple non implicit arguments
    /*
    implicit def meters2centimeters(meters: Meters, secondArg: Boolean): Centimeters =
      Centimeters(meters.value * 100)

    val centimeters1: Centimeters = Meters(2.5)

     */
     //We can not chain multiple implicit conversions
     //val centimeters3 : Centimeters = Kilometers(number)
}


case class Centimeters(value : Double) extends AnyVal
case class Meters(value : Double) extends AnyVal
case class Kilometers(value : Double) extends AnyVal

