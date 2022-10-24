package softwareEngineering.software.designPattern.action.iterator.newMode;

import softwareEngineering.software.designPattern.action.iterator.oldMode.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description 电视界面的迭代器
 * @date 2022/10/24 18:54
 * @see
 */
public class TVChannelMenuIterator implements Iterator {

    List<MenuItem> menuItems;
    int position = 0;

    public TVChannelMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position > menuItems.size() - 1 || menuItems.get(position) == null){
            return false;
        }
        else{
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position ++;
        return menuItem;
    }
}
