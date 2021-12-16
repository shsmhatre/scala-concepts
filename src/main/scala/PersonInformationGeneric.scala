class PersonInformationGeneric[T <:PersonNew] {
  def getDetails(customer: T) = {
      customer.getDetails()
  }

}
