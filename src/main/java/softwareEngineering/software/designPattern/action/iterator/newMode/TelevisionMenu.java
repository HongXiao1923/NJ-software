package softwareEngineering.software.designPattern.action.iterator.newMode;

import java.util.Iterator;

/**
 * @author Einstein
 * @version 1.0
 * @description 菜单接口，该接口提供返回具体迭代器的方法
 * @date 2022/10/24 18:56
 */
public interface TelevisionMenu {

    public void addItem(int channel, String name, String description);

    public Iterator createIterator();

}