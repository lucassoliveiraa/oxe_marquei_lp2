package Model.Entities;

import java.time.LocalDate;

public class PublicAgent extends Person {


    private Integer idPublicAgent;
    private String email;
    private String user;
    private String password;
    private String typeUser;
    private String status;

    public PublicAgent(){}
    public PublicAgent(Integer idPublicAgent, String name, String CPF, String RG, String phoneNumber1,
                       String phoneNumber2, LocalDate dateOfBirth, String address, String email,
                       String user, String password, String typeUser) {
        super(name, CPF, RG, phoneNumber1, phoneNumber2, dateOfBirth, address);
        this.idPublicAgent = idPublicAgent;
        this.email = email;
        this.user = user;
        this.password = password;
        this.typeUser = typeUser;
        this.status = "ativo";
    }

    public PublicAgent(String name, String CPF, String RG, String phoneNumber1,
                       String phoneNumber2, LocalDate dateOfBirth, String address, String email,
                       String user, String password, String typeUser, String status) {
        super(name, CPF, RG, phoneNumber1, phoneNumber2, dateOfBirth, address);
        this.email = email;
        this.user = user;
        this.password = password;
        this.typeUser = typeUser;
        this.status = status;
    }
    public PublicAgent(String name, String CPF, String RG, String phoneNumber1,
                       LocalDate dateOfBirth, String address, String email,
                       String user, String password, String typeUser, String status) {
        super(name, CPF, RG, phoneNumber1, dateOfBirth, address);
        this.email = email;
        this.user = user;
        this.password = password;
        this.typeUser = typeUser;
        this.status = status;
    }
    public PublicAgent(Integer idPublicAgent, String name, String CPF, String RG,
                       String phoneNumber1, String phoneNumber2, LocalDate dateOfBirth,
                       String address, String email, String status) {
        super(name, CPF, RG, phoneNumber1, phoneNumber2, dateOfBirth, address);
        this.idPublicAgent = idPublicAgent;
        this.email = email;
        this.status = status;
    }

    public Integer getIdPublicAgent() {
        return idPublicAgent;
    }

    public void setIdPublicAgent(Integer idPublicAgent) {
        this.idPublicAgent = idPublicAgent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PublicAgent{" +
                "idPublicAgent=" + idPublicAgent +
                ", email='" + email + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", typeUser='" + typeUser + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
