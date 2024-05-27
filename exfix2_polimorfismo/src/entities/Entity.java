package entities;

public abstract class Entity {
    private String name;
    private Double anual_income;

    public Entity(){

    }
    public Entity(String name, Double anual_income) {
        this.name = name;
        this.anual_income = anual_income;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnual_income() {
        return anual_income;
    }
    public void setAnual_income(Double anual_income) {
        this.anual_income = anual_income;
    }

    public abstract double totalTax();

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": $ ");
        sb.append(String.format("%.2f", totalTax()));
        return sb.toString();
    }

}
