public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CommissionedEmployee commissioned = new CommissionedEmployee("Owali", "Ullah", 3000.00, 5000.00, 0.1);
        System.out.println("Commissioned Employee Salary: " + commissioned.salary());

        HourlyEmployee hourly = new HourlyEmployee("DU", "MITs", 2000.000, 99.0, 20.00);
        System.out.println("Hourly Employee Salary: " + hourly.salary());
    }
}