//import com.typesafe.scalalogging.Logger
import play.api.Logger
object ScalaLogging extends App {

      val logger =  Logger(this.getClass())

      logger.info("Hi This is info line")
      logger.debug("Hi This is debug line")
      logger.error("Hi This is error line")

      println("Inside")
      logger.error("Hi This is error line 2")
}