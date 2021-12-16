object PersonDetails extends App {
    var personInformation = new PersonInformation
    var customer = new Customer
    personInformation.getDetails(customer)

    var employee = new EmployeeNew
    //personInformation.getDetails(employee)
    var personInformationGeneric = new PersonInformationGeneric[PersonNew]
    personInformationGeneric.getDetails(customer)

    personInformationGeneric.getDetails(employee)
}
