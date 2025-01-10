//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FacebookAccount f1 = new FacebookAccount("Ana","Cluj", 15);
        FacebookAccount f2 = new FacebookAccount("Maria","Iasi", 19);
        FacebookAccount f3 = new FacebookAccount("Diana", "Sibiu", 20);
        FacebookAccount f4 = new FacebookAccount("Anastasia", "Cluj", 40);

        f1.add(f2);
        f1.add(f3);
        f1.add(f4);
        f1.afisare();
        f1.cautare();
        f1.remove(f2);
        f1.afisare();
        f1.sortare();

    }
}