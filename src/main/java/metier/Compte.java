package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private int code;
    private double solde;
    private Date dateCreation;
    public Compte() {
        super();
    }

    public Compte(int code,double solde,Date dateCreation) {
        this.solde = solde;
        this.code=code;
        this.dateCreation=dateCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
