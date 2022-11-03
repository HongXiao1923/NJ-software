package softwareEngineering.software.designPattern.action.strategy;

/**
 * @author Einstein
 * @version 1.0
 * @description 策略控制器
 * @date 2022/11/3 16:56
 * @see
 */
public class ArrayHandler {
    public Sort sortObj;

    public int[] sort(int[] arr) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj){
        this.sortObj = sortObj;
    }
}
