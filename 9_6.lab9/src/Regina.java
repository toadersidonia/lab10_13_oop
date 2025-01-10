public class Regina extends Piesa{

    public Regina(int pozX, int pozY, String color){
        super("R", pozX, pozY, color);
    }

    public void mutareValida(TablaSah myTabla, int i, int j) {
        int[] dx = {-1, 1, 1, -1, 1, -1, 0, 0};
        int[] dy = {-1, -1, 1, 1, 0, 0, 1, -1}; //toate mutarile de la nebun + tura

        int pozX = this.getCoordX();
        int pozY = this.getCoordY();

        int pozXAux = pozX;
        int pozYAux = pozY;

        Piesa el = myTabla.getElement(i,j);
        Piesa currEl = myTabla.getElement(pozX, pozY);

        String element = el.getNumePiesa();
        String currentElement = currEl.getNumePiesa();

        if (element.equals("_") || (element.equals(element.toLowerCase()) && currentElement.equals(currentElement.toUpperCase())) || (element.equals(element.toUpperCase()) && currentElement.equals(currentElement.toLowerCase()))) { //daca pe pozitia unde vrem sa ajungem nu e niciun element

            for (int d = 0; d < 4; d++) {
                pozX = this.getCoordX();
                pozY = this.getCoordY();

                while (true) {
                    pozX += dx[d];
                    pozY += dy[d];

                    if (pozX == i && pozY == j) {
                        this.setCoordX(i);
                        this.setCoordY(j);
                        myTabla.adaugaPiesa(this);
                        myTabla.stergerePiesa(this);
                        return;
                    }

                    if (pozX < 0 || pozX >= 8 || pozY < 0 || pozY >= 8 || !myTabla.getElement(pozX, pozY).equals("_")) {
                        break;
                    }
                }
            }
        }else{
            System.out.println("Mutare invalida");
        }
    }
}
