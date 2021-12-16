/**
 * A central concept in ScalaTest is the "suite", a collection of zero to many tests
 * Trait "Suite" declares run and other lifecycle methods that define a default way to write and run tests
 * ScalaTest offers "style" trait that extend Suite and override lifecycle method to support different testing
 * styles
 * Its provides mixin traits that override lifecycle methods of the style of the traits to address particular
 * testing needs
 * You define test classes by composing Suite style and mixin traits
 * You define test suites by composing Suite instances
 * To include ScalaTest in your sbt project, simply add this line
 *  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
 *
 *  The styles you choose dictates only how the declarations of your tests will look. Everything else in
 *  ScalaTest - assertions, matchers, mixins traits etc. works consistently the same way no matter what
 *  style you choose


 */

/**
 * Different Style descriptions and examples
 * https://www.scalatest.org/user_guide/selecting_a_style
 */

