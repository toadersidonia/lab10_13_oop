import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   //PetHotel
    HashMap<String, Integer> map = new HashMap<String,Integer>();
    map.put("Rex", 2);
    map.put("Reea", 1);
    map.put("Maia", 3);
    map.put("Azor", 4);
    map.put("Bella", 2);
    System.out.println(map.get("Azor")); //ne da valoarea 4
    for(Map.Entry <String, Integer> Catel : map.entrySet()){
        System.out.println(Catel.getKey() + " " + Catel.getValue());
    }
    }
}