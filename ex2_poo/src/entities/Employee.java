package entities;

public class Employee {
    public String name;
    public double groossSalary;
    public double tax;

    public double netSalary(){
        return groossSalary - tax;
    }
    public void increaseSalary(double percentage){
        groossSalary += groossSalary * (percentage/100);
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
