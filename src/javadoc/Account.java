package javadoc;

/**
 * Classe representant un compte utilisateur.
 * Contient les informations de base comme l'identifiant, le nom d'utilisateur et l'email.
 *
 * @author TonNom
 * @version 1.0
 */
public class Account {
    /** Identifiant unique du compte */
    private int id;
    
    /** Nom d'utilisateur */
    private String username;
    
    /** Adresse email de l'utilisateur */
    private String email;
    
    /**
     * Constructeur de la classe Account.
     *
     * @param id Identifiant unique du compte
     * @param username Nom d'utilisateur
     * @param email Adresse email de l'utilisateur
     */
    public Account(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    
    /**
     * Récupère l'identifiant du compte.
     *
     * @return L'identifiant du compte
     */
    public int getId() {
        return id;
    }
    
    /**
     * Définit l'identifiant du compte.
     *
     * @param id Nouvel identifiant du compte
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Récupère le nom d'utilisateur.
     *
     * @return Le nom d'utilisateur
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Définit le nom d'utilisateur.
     *
     * @param username Nouveau nom d'utilisateur
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Récupère l'adresse email de l'utilisateur.
     *
     * @return L'adresse email de l'utilisateur
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Définit l'adresse email de l'utilisateur.
     *
     * @param email Nouvelle adresse email de l'utilisateur
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Retourne une représentation textuelle de l'objet Account.
     *
     * @return Chaîne de caractères représentant l'Account
     */
    @Override
    public String toString() {
        return "Account [id=" + id + ", username=" + username + ", email=" + email + "]";
    }
}
