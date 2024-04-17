package Model.Entities;

import java.time.LocalDate;

public class Patient extends Person {

    private int idPatient;
    private String email;
    private String SIGTAP;

    public Patient() {

    }
    public Patient(int idPatient, String name, String CPF, String RG, String phoneNumber1,
                   String phoneNumber2, LocalDate dateOfBirth, String address, String email, String SIGTAP) {
        super(name, CPF, RG, phoneNumber1, phoneNumber2, dateOfBirth, address);
        this.idPatient = idPatient;
        this.email = email;
        this.SIGTAP = SIGTAP;
    }

    public Patient(String name, String CPF, String RG, String phoneNumber1,
                   String phoneNumber2, LocalDate dateOfBirth, String address, String email, String SIGTAP) {
        super(name, CPF, RG, phoneNumber1, phoneNumber2, dateOfBirth, address);
        this.email = email;
        this.SIGTAP = SIGTAP;
    }
    public Patient(String name, String CPF, String RG, String phoneNumber1,
                   LocalDate dateOfBirth, String address, String email, String SIGTAP) {
        super(name, CPF, RG, phoneNumber1, dateOfBirth, address);
        this.email = email;
        this.SIGTAP = SIGTAP;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSIGTAP() {
        return SIGTAP;
    }

    public void setSIGTAP(String SIGTAP) {
        this.SIGTAP = SIGTAP;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "  idPatient=" + idPatient +
                ", email='" + email + '\'' +
                ", SIGTAP='" + SIGTAP + '\'' +
                '}';
    }
}