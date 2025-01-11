public class AnBisect {
    public AnBisect(){

    }
    public boolean esteAnBisect(int an){
        return (an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);
    }
}
