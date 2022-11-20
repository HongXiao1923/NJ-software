package headFirst.designPattern.VIIterator.iOld;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/20 15:53
 * @see
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
    }

    public PancakeHouseMenu(List<MenuItem> menuItems) {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancake",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles with your choice of blueberries and strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //以下代码被 createIterator() 替换
    /*public ArrayList<MenuItem> getMenuItems(){
        return (ArrayList<MenuItem>) menuItems;
    }*/

    /**
     * 创建一个迭代器
     * @return
     */
    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
