package entities;

import java.util.ArrayList;
import java.util.List;

import entities_enum.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private double baseSalary;

    private Department department;
    private List <HourContract> contracts = new ArrayList<>();

    public Worker(){
        
    }

    public Worker(String name, WorkerLevel workerLevel, double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    
    public double income(int year, int month){
        double sum = baseSalary;
        for (HourContract c : contracts) {
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
