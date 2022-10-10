package com.kaoyan.dataStructure.recursive;

/**
 * @author Arthur
 * @version 1.0
 * @description: 汉诺塔问题，参考：https://blog.csdn.net/Hurricane_m/article/details/89043699
 * @date 2022/10/8 23:18
 */
public class HanoiDemo {

    private static int count = 0;

    public static void main(String[] args) {
        hanoi(3,'x','y','z');
        System.out.println(" 总共移动了 " + count + " 次" );
    }
    /**
     * 移动
     * @param n 共需要移动的盘子
     * @param x  从起始位置
     * @param y  借助辅助塔
     * @param z  移动到终止位置
     */
    public static void hanoi(int n, char x, char y, char z) {
        count++;
        if(n == 1) {
            move(x,n,z);
        }else {
            hanoi(n-1, x, z, y);
            move(x,n,z);
            hanoi(n-1, y, x, z);
        }
    }
    /**
     * 打印移动
     * @param x  从起使位置
     * @param n  移动第几个盘子
     * @param y  要移动到的最终位置
     */
    private static void move(char x, int n, char y) {
        // TODO Auto-generated method stub
        System.out.println(" Move " + n + " from " + x + " to " + y);
    }
}
