package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Vente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float montantInitial;
    private float montantReserve;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date  dateDebut;
    @Column(nullable = false)
    private Integer duree;
    @Column(nullable = false)
    private String etat;
    
    @ManyToOne
    private Utilisateur utilisateur;
    
    @OneToMany(mappedBy = "vente")
    private Collection<Enchere> enchere;
    
    @ManyToOne
    private Produit produit;

    public Vente() {
        enchere = new ArrayList();
    }

    public Vente(float montantInitial, float montantReserve, Date dateDebut, Integer duree, String etat) {
        this();
        this.montantInitial = montantInitial;
        this.montantReserve = montantReserve;
        this.dateDebut = dateDebut;
        this.duree = duree;
        this.etat = etat;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Collection<Enchere> getEnchere() {
        return enchere;
    }

    public void setEnchere(Collection<Enchere> enchere) {
        this.enchere = enchere;
    }

    public float getMontantInitial() {
        return montantInitial;
    }

    public void setMontantInitial(float montantInitial) {
        this.montantInitial = montantInitial;
    }

    public float getMontantReserve() {
        return montantReserve;
    }

    public void setMontantReserve(float montantReserve) {
        this.montantReserve = montantReserve;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vente)) {
            return false;
        }
        Vente other = (Vente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Vente[ id=" + id + " ]";
    }
    
}
