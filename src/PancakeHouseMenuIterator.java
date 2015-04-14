import java.util.ArrayList;

/**
 * Created by biggreyhairboy on 4/14/15.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items){
        this.items = items;
    }

    public Object next(){
//        MenuItem menuItem = items.
//        position = position + 1;
//        return menuItem;
        return  null;
    }

    public boolean hasNext(){
//        if (items.get(position)==null || items == null){
//            return false;
//        }else{
//            return true;
//        }
        return false;
    }
}
