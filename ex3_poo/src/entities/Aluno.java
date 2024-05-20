package entities;

public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;
    
    public double final_grade(){
        return n1 + n2 + n3;
    }
    public void aproved(){
        if(final_grade() < 60.0){
            double resto = 60.0 - final_grade();
            System.out.printf("Failed%nMissing %.2f points.", resto); 
        } else{
            System.out.println("PASS");
        }
    }
}
