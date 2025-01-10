public class Tura extends Piesa{
    public Tura(int coordX, int coordY, String color){
        super("T", coordX, coordY, color);
    }

    public void mutareValida(TablaSah myTabla, int i, int j) {
        int pozX = this.getCoordX();
        int pozY = this.getCoordY();

        if (pozX != i && pozY != j) {
            System.out.println("Mutare invalida");
            return;
        }

        int dx = Integer.compare(i, pozX);
        int dy = Integer.compare(j, pozY);
        int x = pozX + dx;
        int y = pozY + dy;

        while(x != i || y != j){
            if(myTabla.getElement(x, y) != null){
                System.out.println("Mutare invalida");
                return;
            }
            x += dx;
            y += dy;
        }

        Piesa destinatie = myTabla.getElement(i, j);
        if (destinatie != null && destinatie.getColor().equals(this.getColor())) {
            System.out.println("Mutare invalida");
            return;
        }

        myTabla.stergerePiesa(this);
        this.setCoordX(i);
        this.setCoordY(j);
        myTabla.adaugaPiesa(this);
    }
}
