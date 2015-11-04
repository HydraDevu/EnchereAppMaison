package essai;

import entites.Categorie;
import entites.Enchere;
import entites.Produit;
import entites.Utilisateur;
import entites.Vente;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AppliMain01 {
    public static void main(String[] args) {
        System.out.println("====================DEBUT================");
         EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("EnchereAppMaisonPU");
        EntityManager em = emf.createEntityManager();
        
        
        
        //jeu de test

        
        //Creation Categorie
        
        Categorie cat1 = 
                new Categorie("Informatique et Multimedia");
        
        Categorie cat2 = 
                new Categorie("Divertissement");
        
        Categorie cat3 =
                new Categorie("Vehicule");
        
        em.persist(cat1);
        em.persist(cat2);
        em.persist(cat3);
        
        //Creation Produit
        Produit pdt1 = 
                new Produit("Console Ps4", "Pack collector Ps4 Metal Gear Solid V", "Etat Moyen");
        
        Produit pdt2 = 
                new Produit("Teddy Bear", "Ours en peluche vraiment sympa ", "Etat extremement nul");
        
        Produit pdt3 = 
                new Produit("Ford Mustang", "Ford Mustand V6 coupé cab full option", "Très bon etat");
        
        Produit pdt4 = 
                new Produit("PC Portable", "Hewlett Packard Elitebook 840 G2", "Etat proche du neuf");
        
        Produit pdt5 = 
                new Produit("Windows Seven", "Systeme d'exploitation windows 7 jamais ouvert", "Neuf");
        
        em.persist(pdt1);
        em.persist(pdt2);
        em.persist(pdt3);
        em.persist(pdt4);
        em.persist(pdt5);
        
        pdt1.setCategorie(cat2);
        pdt2.setCategorie(cat2);
        pdt3.setCategorie(cat3);
        pdt4.setCategorie(cat1);
        pdt5.setCategorie(cat1);
        //Creation Vente
        Date d01 = new GregorianCalendar(2015, 10, 4, 10, 30,00 ).getTime();
        Vente vte1 =
                new Vente(500f, 700f, d01, 60, "A venir");
        
        Date d02 = new GregorianCalendar(2015, 19, 11, 10, 30,00 ).getTime();
        Vente vte2 =
                new Vente(1f, 5f, d02, 15, "Terminé");
        
        Date d03 = new GregorianCalendar(2016, 11, 21, 10, 30,00 ).getTime();
        Vente vte3 =
                new Vente(20000f, 27000f, d03, 120, "A venir");
        
        Vente vte4 =
                new Vente(1000f, 1500f, d02, 90, "Terminé");
        
        Vente vte5 = 
                new Vente(75.5f, 80f, d03, 30,"A venir");
        
        em.persist(vte1);
        em.persist(vte2);
        em.persist(vte3);
        em.persist(vte4);
        em.persist(vte5);
        
        vte1.setProduit(pdt1);
        vte2.setProduit(pdt2);
        vte3.setProduit(pdt3);
        vte4.setProduit(pdt4);
        vte5.setProduit(pdt5);
        
        
        //Creation Enchere
        //Enchere PC Gaming
        
        Enchere Ench1 = 
                new Enchere(100f);
        
        Enchere Ench2 = 
                new Enchere(500f);
        
        Enchere Ench3 = 
                new Enchere(850f);
        
        vte1.getEnchere().add(Ench1);
        vte1.getEnchere().add(Ench2);
        vte1.getEnchere().add(Ench3);
        //Enchere Peluche
        
        Enchere Ench4 = 
                new Enchere(3.5f);
        
        Enchere Ench5 = 
                new Enchere(5f);
        
        Enchere Ench6 = 
                new Enchere(10f);
        vte2.getEnchere().add(Ench4);
        vte2.getEnchere().add(Ench5);
        vte2.getEnchere().add(Ench6);
        
        
        //Enchere Mustang
        
        Enchere Ench7 = 
                new Enchere(1000f);
        
        Enchere Ench8 = 
                new Enchere(10000f);
        
        Enchere Ench9 = 
                new Enchere(5000f);
        
        Enchere Ench10 = 
                new Enchere(30000f);
        
        vte3.getEnchere().add(Ench7);
        vte3.getEnchere().add(Ench8);
        vte3.getEnchere().add(Ench9);
        vte3.getEnchere().add(Ench10);
        //Enchere Elitebook
        Enchere Ench11 = 
                new Enchere(1100f);
        
        Enchere Ench12 = 
                new Enchere(1250f);
        
        Enchere Ench13 = 
                new Enchere(1400f);
        
        vte4.getEnchere().add(Ench11);
        vte4.getEnchere().add(Ench12);
        vte4.getEnchere().add(Ench13);
        //Enchere Windows 7
        
        Enchere Ench14 = 
                new Enchere(20f);
        
        Enchere Ench15 = 
                new Enchere(22f);
        
        Enchere Ench16 = 
                new Enchere(50f);
        
        Enchere Ench17 = 
                new Enchere(56f);
        
        Enchere Ench18 = 
                new Enchere(57f);
        
        Enchere Ench19 = 
                new Enchere(58f);
        
        Enchere Ench20 = 
                new Enchere(75f);
        
        
        em.persist(Ench1);
        em.persist(Ench2);
        em.persist(Ench3);
        em.persist(Ench4);
        em.persist(Ench5);
        em.persist(Ench6);
        em.persist(Ench7);
        em.persist(Ench8);
        em.persist(Ench9);
        em.persist(Ench10);
        em.persist(Ench11);
        em.persist(Ench12);
        em.persist(Ench13);
        em.persist(Ench14);
        em.persist(Ench15);
        em.persist(Ench16);
        em.persist(Ench17);
        em.persist(Ench18);
        em.persist(Ench19);
        em.persist(Ench20);
        
        
        vte5.getEnchere().add(Ench14);
        vte5.getEnchere().add(Ench15);
        vte5.getEnchere().add(Ench16);
        vte5.getEnchere().add(Ench17);
        vte5.getEnchere().add(Ench18);
        vte5.getEnchere().add(Ench19);
        vte5.getEnchere().add(Ench20);
        
        

                //Creation utilisateurs
        Utilisateur ut1 = 
                new Utilisateur("Inelhaj", "Ibrahim", "email.email@email.com","motDePasse01");
        
        Utilisateur ut2 = 
                new Utilisateur("HickenNo", "Ace", "HickenNoAce@gmail.com","MonkeyD");
        
        Utilisateur ut3 = 
                new Utilisateur("MuguiwaraNo", "Luffy", "Mugui-senpai@gmail.com", "Muguigui");
        
        Utilisateur ut4 = 
                new Utilisateur("BenArfa", "Hatem", "Hatem.BenArfite@gmail.com","Hatem01");
        
        Utilisateur ut5 = 
                new Utilisateur("Smith", "William", "will.smith@gmail.com", "wiwiNYC");

        
        
        ut1.getVente().add(vte5);
        ut1.getVente().add(vte3);
        ut1.getVente().add(vte1);
        ut2.getVente().add(vte2);
        ut2.getVente().add(vte3);
        ut3.getVente().add(vte4);
        ut3.getVente().add(vte5);
        ut4.getVente().add(vte1);
        ut4.getVente().add(vte3);
        ut4.getVente().add(vte4);
        ut5.getVente().add(vte1);
        ut5.getVente().add(vte3);
        ut5.getVente().add(vte4);
        ut5.getVente().add(vte5);
        
        //Persistence des données
        
        em.persist(ut1);
        em.persist(ut2);
        em.persist(ut3);
        em.persist(ut4);
        em.persist(ut5);
        
        //Transaction
        
        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();
        
        em.close();
        emf.close();
        System.out.println("=====================FIN====================");
    }
    
}
