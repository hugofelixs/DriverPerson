public class FullTime extends Teacher{
    private int annualSalary;
    private String unit;

    public FullTime(){
        super();
        annualSalary = 0;
        unit = "";
    }

    public FullTime(String name, int age, String subject, int annualSalary, String unit){
        super(name, age, subject);
        this.annualSalary = annualSalary;
        this.unit = unit;
    }

    public int getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void print(){
        super.print();
        System.out.println("Annual Salary\t: "+annualSalary);
        System.out.println("Unit\t\t: "+unit);
    }

}
