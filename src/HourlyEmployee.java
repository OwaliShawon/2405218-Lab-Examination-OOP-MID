public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;
    public HourlyEmployee(String firstName, String lastName, Double salary, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, salary);
        this.hourlyRate= hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) throws Exception {
        if(hourlyRate<=0){
            throw new Exception("Cant be less than zero");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) throws Exception {
        if(hoursWorked<=0){
            throw new Exception("Cant be less than zero");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double salary() {
         return getSalary() + (hoursWorked * hourlyRate);
    }
}
