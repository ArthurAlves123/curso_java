package entities;


public class CorporativeEntity extends Entity{
    private Integer num_funcionarios;

    public CorporativeEntity(){
        super();
    }

    public CorporativeEntity(String name, Double anual_income, Integer num_funcionarios) {
        super(name, anual_income);
        this.num_funcionarios = num_funcionarios;
    }

    public Integer getNum_funcionarios() {
        return num_funcionarios;
    }

    public void setNum_funcionarios(Integer num_funcionarios) {
        this.num_funcionarios = num_funcionarios;
    }

    @Override
    public double totalTax() {
        if (num_funcionarios <= 0) {
            return super.getAnual_income() * 0.16;
        } else {
            return super.getAnual_income() * 0.14;
        }
    }

}
