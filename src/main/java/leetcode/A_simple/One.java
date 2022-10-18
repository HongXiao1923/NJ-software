package leetcode.A_simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *@description 两数之和：https://leetcode.cn/problems/two-sum/
 *@author Einstein
 *@date 2022/10/11 18:48
 *@version 1.0
 */

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */

/**
 * 题目之外：关于直接返回数组（不必提前声明数组）： return new int[]{i,j};
 */
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        //
        int[] ans = twoSum(nums, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    /**
     * 哈希解法：现在hash中预存后续可能出现的求和的另一个值，每次匹配的时候先判断当前值是否已经预存，若是则直接返回
     *      否则继续预存后面的值。
     * 时空：O(n)、O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(target - nums[0], 0);
        int[] ret = new int[2];
        for(int i = 1; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                ret[0] = hash.get(nums[i]);
                ret[1] = i;
                return ret;
                //return new int[]{hash.get(nums[i]), i};
            }else{
                hash.put(target - nums[i], i);
            }
        }
        return null;
    }

    /**
     * ArrayList：思路同解法1一样，实现不一样。缺点：indexOf()为顺序遍历
     * 时空：O(n^2)、O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                res[0] = list.indexOf(nums[i]);
                res[1] = i;
            }
            list.add(target - nums[i]);
        }
        return res;
    }
}
