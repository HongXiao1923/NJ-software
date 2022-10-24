package softwareEngineering.software.designPattern.action.iterator.oldMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Einstein
 * @version 1.0
 * @description 小李子负责电视频道菜单的实现。他是使用List实现的，他认为这样就可以非常方便的扩展菜单。
 * @date 2022/10/24 17:08
 * @see
 */
public class TVChannelMenu implements TelevisionMenu{
    List<MenuItem> menuItems;

    /**
     * 构造函数完成初始化
     */
    public void TVChannelMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    /**
     * @desc 将电视频道节目添加菜单集合中
     * @param channel  频道
     * @param name  名称
     * @param description  描述
     * @return void
     */
    public void addItem(int channel,String name,String description){
        MenuItem tvMenuItem = new MenuItem(channel, name, description);
        menuItems.add(tvMenuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

}