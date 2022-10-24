package softwareEngineering.software.designPattern.action.iterator.newMode;

import softwareEngineering.software.designPattern.action.iterator.oldMode.MenuItem;

import java.util.Iterator;

/**
 * @author Einstein
 * @version 1.0
 * @description 电影节目的迭代器
 * @date 2022/10/24 18:51
 * @see
 */
public class FilmMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    /**
     * 构造方法实现迭代器
     * @param menuItems
     */
    public FilmMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position > menuItems.length - 1 || menuItems[position] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

}
