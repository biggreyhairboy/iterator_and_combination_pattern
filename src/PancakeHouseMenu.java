import java.util.ArrayList;

/**
 * Created by biggreyhairboy on 4/14/15.
 */
public class PancakeHouseMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    ArrayList menuItems;

    public PancakeHouseMenu(){
        addItems("K&B pancake breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItems("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 2.99);
        addItems("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItems("Waffles", "Walffles with your choice of blueberries or Strawberries", true, 3.59);

    }

    public void addItems(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
