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

    /**
     * 策略模式的核心的这里：根据 sortObj 动态选择排序方法
     * @param sortObj
     */
    public void setSortObj(Sort sortObj){
        this.sortObj = sortObj;
    }
}
