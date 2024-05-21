package entities;

import java.time.LocalDate;

public class Client {
    private String client_name;
    private String client_email;
    private LocalDate client_bithDate;
    
    public Client() {
    }

    public Client(String client_name, String client_email, LocalDate client_bithDate) {
        this.client_name = client_name;
        this.client_email = client_email;
        this.client_bithDate = client_bithDate;
    }

    public String getClient_name() {
        return client_name;
    }
    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
    public String getClient_email() {
        return client_email;
    }
    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }
    public LocalDate getClient_bithDate() {
        return client_bithDate;
    }
    public void setClient_bithDate(LocalDate client_bithDate) {
        this.client_bithDate = client_bithDate;
    }

}
