package leo.techs.user_service.model;

public class DemandeCreationCompte {
    private int userId;
    private int numeroCompte;

    public DemandeCreationCompte(){

    }
    
    public DemandeCreationCompte(int userId, int numeroCompte) {
        this.userId = userId;
        this.numeroCompte = numeroCompte;
    }

    public int getUserId() {
        return userId;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    

    
    
    


    
}
