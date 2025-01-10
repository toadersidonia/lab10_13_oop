public class Pion extends Piesa {

    public Pion(int coordX, int coordY, String color){
        super("P", coordX, coordY, color);
    }

    public void mutareValida(TablaSah myTabla, int i, int j){
        int pozX = this.getCoordX();
        int pozY = this.getCoordY();
        Piesa el = myTabla.getElement(i,j);
        Piesa currEl = myTabla.getElement(pozX, pozY);

        String element = el.getNumePiesa();
        String currentElement = currEl.getNumePiesa();

        if(i >= 0 && i < 8 && j >= 0 && j < 8){
            if(element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))){
                if(i - pozX == 1 && pozY == j){
                    this.setCoordX(i);
                    myTabla.adaugaPiesa(this);
                    myTabla.stergerePiesa(el);
                }else{
                    System.out.println("Mutare invalida");
                }
            }else{
                System.out.println("Casuta e ocupata");
            }
        }else{
            System.out.println("Mutare invalida");
        }
    }
}
