package headFirst.designPattern.VIIterator.iiNew;



import java.util.Iterator;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/20 16:28
 * @see
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
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
