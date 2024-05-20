package entities;

public class Aluguel {
    private String nome;
    private String email;
    private int n_quarto;

    public Aluguel(String nome, String email, int n_quarto) {
        this.nome = nome;
        this.email = email;
        this.n_quarto = n_quarto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getN_quarto() {
        return n_quarto;
    }
    public void setN_quarto(int n_quarto) {
        this.n_quarto = n_quarto;
    }
    

}
