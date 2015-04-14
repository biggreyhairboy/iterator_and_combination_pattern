import jdk.internal.org.objectweb.asm.tree.InvokeDynamicInsnNode;

/**
 * Created by biggreyhairboy on 4/13/15.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Baken with Lettuce & tommato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Baken with Lettuce & tommato on whole wheat",
                false,
                2.99);
        addItem("Soup of the Day",
                "soup of the day, with a side of potato salad",
                false,
                3.29);
        addItem("Hotdog",
                "A hotdog with saurkraut, relish, topped with cheese",
                false,
                3.05);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to Menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
