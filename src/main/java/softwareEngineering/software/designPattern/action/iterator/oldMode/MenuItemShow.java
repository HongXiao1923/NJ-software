package softwareEngineering.software.designPattern.action.iterator.oldMode;

import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/24 17:20
 * @see
 */
public class MenuItemShow {
    public static void main(String[] args) {

    }

    /**
     * 问题描述：当需要进行类似遍历时，由于采用的接口不一样，所以需要针对性地使用不同的迭代器。
     *          所以你就想是不是可以来封装循环呢？不错就是封装遍历。这就是迭代器模式的动机--能够游走于聚合内的每一个元素，
     *          同时还可以提供多种不同的遍历方式。
     * @return
     */
    public static List<MenuItem> show(){
        TVChannelMenu tvMenu = new TVChannelMenu();
        List<MenuItem> tvMenuItems = tvMenu.getMenuItems();
        for(int i = 0 ; i < tvMenuItems.size() ; i++){
            MenuItem menuItem = tvMenuItems.get(i);
            //............
        }

        FilmMenu filmMenu = new FilmMenu();
        MenuItem[] filmItems = filmMenu.getMenuItems();
        for(int i = 0 ; i < filmItems.length ; i++){
            MenuItem menuItem = filmItems[i];
            //............
        }

        return tvMenuItems;
    }
}
