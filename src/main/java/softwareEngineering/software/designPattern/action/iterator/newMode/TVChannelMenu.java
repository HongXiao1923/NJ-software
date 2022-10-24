package softwareEngineering.software.designPattern.action.iterator.newMode;

import softwareEngineering.software.designPattern.action.iterator.oldMode.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/24 19:06
 * @see
 */
public class TVChannelMenu implements TelevisionMenu{
    List<MenuItem> menuItems;

    /**
     * 构造函数完成初始化
     */
    public TVChannelMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    /**
     * @description 将电视频道节目添加菜单集合中
     * @param channel  频道
     * @param name  名称
     * @param description  描述
     * @return void
     */
    public void addItem(int channel,String name,String description){
        MenuItem tvMenuItem = new MenuItem(channel, name, description);
        menuItems.add(tvMenuItem);
    }

    public Iterator createIterator() {
        return new TVChannelMenuIterator(menuItems);
    }

}
