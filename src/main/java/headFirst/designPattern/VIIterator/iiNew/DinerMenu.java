package headFirst.designPattern.VIIterator.iiNew;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/11/20 16:09
 * @see
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;   //数组实现

    public DinerMenu() {
    }

    public DinerMenu(MenuItem[] menuItems) {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin's) Bacon with lettuce & tomato whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false,
                3.05);

        this.menuItems = menuItems;
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems > MAX_ITEMS){
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    //以下代码被 createIterator() 替换
    /*public MenuItem[] getMenuItems(){
        return menuItems;
    }*/

    /**
     * 创建一个迭代器
     * @return
     */
    @Override
    public Iterator<MenuItem> createIterator(){
        return Arrays.stream(menuItems).iterator();
    }
}
