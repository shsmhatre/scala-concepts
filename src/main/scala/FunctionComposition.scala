/**
 * Function composition is a way in which function is mixed with other functions
 * During composition one function holds the reference to another function
 *
 */
object FunctionComposition extends App{
  /**
   * 3 different ways function composition works
   * 1. compose - Composion method works with val functions
   * (function1 compose function2)(parameter)
   */

    val add = (a: Int) => {
        a + 1
    }
    val mul = (a:Int) => {
      a * 2
    }
    val sub = (a: Int) => {
      a - 1
    }
    println((add compose mul compose sub)(3))

  /**
   * 2. andThen method also works with val function
   * (function1 andThen function2)(parameter)
   * function1 works first with parameter passed, then passes the return value to next function
    */
    println((add andThen mul andThen sub)(3))

  /**
   * 3. Passing methods to methods
   * It works same as compose function, but works with def and val methods
   */
    println(add(mul(sub(3))))

}
