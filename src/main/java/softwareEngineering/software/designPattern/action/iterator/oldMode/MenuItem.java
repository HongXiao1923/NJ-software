package softwareEngineering.software.designPattern.action.iterator.oldMode;

/**
 * @author Einstein
 * @version 1.0
 * @description 对电视机的电视频道、电影和收音机菜单进行统一管理，建立一个统一的菜单管理界面，能够看到所有的电视界面、电影界面和收音机频道。
 *              你有三个手下：小李子、小杏子、小安子，他们分别就每个模块做开发工作
 * @date 2022/10/24 17:03
 * @see
 */
public class MenuItem {
    private String name;
    private String description;
    private int channel;

    public MenuItem(int channel,String name, String description){
        this.name = name;
        this.description = description;
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

}
