package DZ1;
import java.util.*;

public class main {

    public static void main(String[] args) {

        List<HotDrink> newList = new LinkedList<>();

        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine(newList);

        HotDrink coffee = new HotDrink("Latte", 30.0, 350, 80);
        HotDrink blackTea = new HotDrink("Kimoon", 35.0, 450, 85);

        newList.add(coffee);
        newList.add(blackTea);

        System.out.println(machine1.getProduct("Latte", 350, 80));
        System.out.println(machine1.getProduct("Kimoon", 450, 85));
    }
}