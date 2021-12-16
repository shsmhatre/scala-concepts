/**
 *
 */

/**
 * Like Auditor, PersonInformation is class - which is giving Customer information - getDetails
 * getDetails
 */
class Auditor {
  def getTeamSize(x: TechnologyTeam) = {
    x.getTeamSize()
  }
}

object GenericsExampleCustomClasses extends App {
    //Creating object of TechnologyTeam and normal Auditor class and get the size of TechnologyTeam
    var technologyTeam = new TechnologyTeam
    var auditor = new Auditor
    println(s"Size of the technology team: ${auditor.getTeamSize(technologyTeam)}")
    //If I want to know the size of the HRTeam from the same Auditor class I can't do it
    var hrTeam = new HrTeam

    //auditor.getTeamSize(hrTeam) // it does not work, we can't pass hrTeam object as we bound to only
    //technology team

    //Same with Generics
    var auditorGenerics = new AuditorGenerics[TechnologyTeam]
    println(s"Size of the technology team:${auditorGenerics.getTeamSize(technologyTeam)}")

    var auditorGenericsHr = new AuditorGenerics[HrTeam]
    println(s"Size of the hr team:${auditorGenericsHr.getTeamSize(hrTeam)}")
}


class TechnologyTeam extends Organization {
    def getTeamSize() = {
        5
    }
}
class HrTeam extends Organization {
  def getTeamSize(): Int = {
      10
  }
}
/**
 * We have Auditor class, which is taking object of TechnologyTeam class as input and returning size
 * of the team
 * We have TechnologyTeam class which contains getTeamSize method to return the size
 * Real world examples of generics are Collections
 */

class AuditorGenerics[T <: Organization] {
    def getTeamSize(x: T) = {
        x.getTeamSize()
    }
}
trait Organization {
    def getTeamSize():Int
}