/**
 * Partial function is a unary operation, which means it only takes one parameter
 *  it is applicable to subdomain of values
 *  can explicitly include an "isDefinedAt" method, to define its domain, and an "apply" method
 *
 *
 * Partial function of type PartialFunction[A, B] is a unary function where the domain does not necessarily
 * include all values of type A. The function isDefinedAt allows to test dynamically if a value is in the
 * domain of the function
 *
 * A -  input type, B - output type
 *
 * It is the responsibility of the caller to call isDefinedAt before calling apply
 * If isDefinedAt is false, it is not guaranteed apply will throw an exception to indicate an error
 * condition. If an exception is not thrown, evaluation may result in an arbitrary value
 *
 * The usual way to respect this contrast is to call applyOrElse, which is expected to be more efficient
 * than calling both isDefinedAt and apply
 *
 */

object PartialFunctions{
    def main(args : Array[String]): Unit = {
      val multiPlyWihNonZero = new PartialFunction[Double, Double]  {
        def apply(x: Double) = Math.sqrt(x)
        def isDefinedAt(x: Double) = x > 0
      }
      println(multiPlyWihNonZero(0))
      /**
       * Takes a single parameter Double
       * applies to Double subdomain, such as x > 0
       * has an isDefinedAt method and apply method
       *
       * isDefinedAt and apply are often implicitly defined
       *
       * We can rewrite our function using a case statement
       */
        val multiplyByThree : PartialFunction[Double, Double] = {
          case x if (x %3) ==0 => x*3
      }
      var number = 2
      if(multiplyByThree.isDefinedAt(number) ) {
        println(s"Multiplication of ${number}: " +multiplyByThree(number))
      } else {
        println(s"${number} is not divisible by 3")
      }

      /**
       * Chaining of partial functions using orElse
       */
        val m : PartialFunction[Int, Int] =  {
            case x if (x % 5) == 0 => x*5
            case x if (x % 7) == 0 => x*7
        }
        val n : PartialFunction[Int, Int] = {
          case y if (y % 2) ==0 => y*2
        }
        //Chaining 2 partial functions using orElse
        var r = m orElse n
        println("Passing test for both 5 & 7:"+ r(35))
        println("Passing test only for 7:"+ r(21))
        println("Failing test only for both 5 and 7:"+ r(4))
        //println("Failing test only for all 3:"+ r(3))
        val p = 3
        if (r.isDefinedAt(p)) {
           println(s"Function defined for ${p} values is ${r(p)}" )
        }  else {
           println(s"Function is not defined for ${p}")
        }
      /**
       * Partial function using collect Method
       *  Collect method requests partial function to every single element of the collection and
       *  creates new collection
       */
        val y = List(5, 7, 2, 3, 10).collect {m orElse n}
        println(y)

      /**
       * In above example 3 is not divisible with 5, 7 or 2 which is giving error if called without i
       *  isDefinedAt but collect handles it internally
       */

        var hrManager = new HRManager(1, "Suhas")
        var numberTest = 2
        if (hrManager.multiplyByThree.isDefinedAt(2)) {
           println(s" Partial function test through classes :${hrManager.multiplyByThree(numberTest)}")
        } else {
           println(s" Partial function not defined for number : ${numberTest}")
        }

    }




}
