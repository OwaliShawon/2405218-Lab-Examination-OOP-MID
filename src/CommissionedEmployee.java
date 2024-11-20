public class CommissionedEmployee extends Employee{
    double commission;
    double totalSales;
    public CommissionedEmployee(String firstName, String lastName, Double salary, Double commission, double totalSales) {
        super(firstName, lastName, salary);
        this.commission = commission;
        this.totalSales = totalSales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission( double commission) throws Exception {
        if(commission<=0){
            throw new Exception("Cant be less than zero");
        }
        this.commission=  commission;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) throws Exception {
        if(totalSales<=0){
            throw new Exception("Cant be less than zero");
        }
        this.totalSales = totalSales;
    }

    @Override
    public double salary() {
        return this.getSalary() + (totalSales * commission);
    }

}
