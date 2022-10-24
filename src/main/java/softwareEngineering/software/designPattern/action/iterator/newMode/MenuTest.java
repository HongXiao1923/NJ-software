package softwareEngineering.software.designPattern.action.iterator.newMode;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/24 19:10
 * @see
 */
public class MenuTest {
    public static void main(String[] args) {
        TVChannelMenu tvMenu = new TVChannelMenu();
        FilmMenu filmMenu = new FilmMenu();

        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}
