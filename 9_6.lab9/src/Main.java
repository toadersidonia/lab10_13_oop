//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TablaSah tablaSah = new TablaSah();
        Regina r1 = new Regina(3, 4, "R");
        Tura t1 = new Tura(1, 2, "t");
        Nebun n1 = new Nebun(5, 5, "n");

        tablaSah.adaugaPiesa(r1);
        tablaSah.adaugaPiesa(t1);
        tablaSah.adaugaPiesa(n1);

        tablaSah.afisareTabla();
        System.out.println("");

        t1.mutareValida(tablaSah,1, 6);

        tablaSah.afisareTabla();
    }
}