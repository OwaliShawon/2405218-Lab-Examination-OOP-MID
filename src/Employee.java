abstract class Employee {
    String firstName;
    String lastName;
    Double salary;

    public Employee(String firstName, String lastName, Double salary){
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception {
        if(firstName == null || firstName.isEmpty()){
            throw new Exception("firstName cant be empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception {
        if(lastName == null || lastName.isEmpty()){
            throw new Exception("firstName cant be empty");
        }
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) throws Exception {
        if(salary <=0){
            throw new Exception("Cant be less than zero");
        }
        this.salary = salary;
    }

    public abstract double salary();
}
