package softwareEngineering.software.designPattern.action.iterator.newMode;

import softwareEngineering.software.designPattern.action.iterator.oldMode.MenuItem;

import java.util.Iterator;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/24 19:08
 * @see
 */
public class MainMenu {
    TVChannelMenu tvMenu;
    FilmMenu filmMenu;

    public MainMenu(TVChannelMenu tvMenu,FilmMenu filmMenu){
        this.tvMenu = tvMenu;
        this.filmMenu  = filmMenu;
    }

    public void printMenu(){
        Iterator tvIterator = tvMenu.createIterator();
        Iterator filmIterator = filmMenu.createIterator();

        System.out.println("电视节目有:");
        printMenu(tvIterator);
        System.out.println("----------------------------------------------------------------");
        System.out.println("电影节目有:");
        printMenu(filmIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print("channel:"+ menuItem.getChannel()+",  ");
            System.out.print("name:"+menuItem.getName()+",  ");
            System.out.println("description :"+menuItem.getDescription());
        }
    }
}
