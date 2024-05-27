package entities;

public class PhysicEntity extends Entity{
    private Double health_expenditures;

    public PhysicEntity(){
        super();
    }

    public PhysicEntity(String name, Double anual_income, Double health_expenditures) {
        super(name, anual_income);
        this.health_expenditures = health_expenditures;
    }

    public Double getHealth_expenditures() {
        return health_expenditures;
    }

    public void setHealth_expenditures(Double health_expenditures) {
        this.health_expenditures = health_expenditures;
    }

    @Override
    public double totalTax() {
        if (super.getAnual_income() < 20000) {
            return super.getAnual_income() * 0.15 - health_expenditures * 0.5;
        } else {
            return super.getAnual_income() * 0.25 - health_expenditures * 0.5;
        }
    }
}
