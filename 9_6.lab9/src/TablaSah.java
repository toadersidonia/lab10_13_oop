import java.util.ArrayList;

public class TablaSah {

    ArrayList<Piesa> piese = new ArrayList<Piesa>();

    public Piesa getElement(int i, int j) {
        for (Piesa p : piese) {
            if (p.getCoordX() == i && p.getCoordY() == j) {
                return p;
            }
        }
        return null;
    }

    public void adaugaPiesa(Piesa p){
        piese.add(p);
    }

    public boolean equals(Piesa p){
        for(Piesa p1: piese){
            if(p1.getCoordX() == p.getCoordY() && p1.getCoordX() == p.getCoordX() && p1.getCoordY() == p.getCoordY()){
                return true;
            }
        }
        return false;
    }

    public void stergerePiesa(Piesa p){
        piese.remove(p);
    }

    public void afisareTabla(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Piesa p = getElement(i, j);
                if(p == null){
                    System.out.print("_");
                }else{
                    System.out.print(p.getNumePiesa());
                }
            }
            System.out.println();
        }
    }
}
