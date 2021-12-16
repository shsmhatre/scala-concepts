/**
 * Traits - you can declare and define method and parameters
 * You can have both declaration and definition
 */

object ScalaTraitExample extends App{
      //Person as Trait
      //Employee as Trait
      //HRManager is class
      var hrManager = new HRManager(1, "Technology")
      println("Employee details:"+hrManager.getEmployeeDetails())
      println("Training schedule:" +hrManager.getTrainingSchedule("Saturday", "08:00"))
      println("Person details:"+hrManager.getPersondetails("Suhas", "Navi Mumbai"))
      //println("Person details:"+hrManager.getPersondetails("Suhas", "Navi Mumbai", "9870014036"))


}
