import java.util.*;
public class FacebookAccount implements Comparable<FacebookAccount>{
    private String nume;
    private String locatie;
    private int varsta;
    private ArrayList<FacebookAccount> prieteni = new ArrayList<FacebookAccount>();

    public FacebookAccount(){
        nume = null;
        locatie = null;
        varsta = 0;
    }
    public FacebookAccount(String nume, String locatie, int varsta){
        this.nume = nume;
        this.locatie = locatie;
        this.varsta = varsta;
    }
    public void afisare(){
        System.out.println("Nume: " + nume + '\n' + "Varsta: " + varsta + '\n' + "Locatie: " + locatie + '\n');
        System.out.println("Lista de prieteni:" + '\n');
        for(FacebookAccount p: prieteni){
            System.out.println(p.nume + " " + p.varsta + " " + p.locatie);
        }
    }
    public void add(FacebookAccount p){
        this.prieteni.add(p);
    }
    //suprascriem equals, remove se bazeaza pe equals, merge doar pe string uri daca nu
    public boolean equals(FacebookAccount p){
        return this.nume.equals(p.nume) && this.varsta == p.varsta && this.locatie.equals(p.locatie);
    }
    public void remove(FacebookAccount p){
        this.prieteni.remove(p);
    }
    public void cautare(){
        System.out.println("Prietenii din aceeasi locatie: " + '\n');
        for(FacebookAccount p1: prieteni){
            if(this.locatie.equals(p1.locatie)){
                System.out.println(p1.nume + " " + p1.varsta + " " + p1.locatie + '\n');
            }
        }
    }
    public ArrayList<FacebookAccount> getPrieteni(){
        return prieteni;
    }
    public String getNume(){
        return this.nume;
    }
    //suprascriem metoda compareTo
    public int compareTo(FacebookAccount p){
        return this.nume.compareTo(p.nume);
    }
    public void sortare(){
        Comparator c = new Comparator<FacebookAccount>() {
            public int compare(FacebookAccount p1, FacebookAccount p2) {
                return p2.nume.compareTo(p1.nume);
            }
        }; //e un critriu dupa care vrem sa sortam
        //daca voiam dupa varsta, mai faceam un comparator
        Collections.sort(getPrieteni(), c);
        //trebuie sa implementm interfata Comparable sau ne definim noi un comparator
        System.out.println("Lista sortata de prieteni: ");
        for(FacebookAccount p: prieteni){
            System.out.println(p.nume + " " + p.varsta + " " + p.locatie);
        }
    }
}
