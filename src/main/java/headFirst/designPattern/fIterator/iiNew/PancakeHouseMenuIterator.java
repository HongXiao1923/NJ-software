package headFirst.designPattern.fIterator.iiNew;


import java.util.Iterator;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/20 16:36
 * @see
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;

        return menuItem;
    }

    /**
     * 此方法可选
     */
    @Override
    public void remove(){
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
