package softwareEngineering.dataStructure.example;

import softwareEngineering.dataStructure.stracture.BinaryNode;

/**
 * @author Einstein
 * @version 1.0
 * @description 遍历二叉排序树，由大到小输出不小于k的数据
 *              二叉树结点结构为：left data right
 * @date 2022/10/19 20:38
 * @see
 */
public class Two {
}

class BinarySearchTree{
    private BinaryNode root;

    public BinarySearchTree(){
        root =null;
    }
    public void BSTFind(BinaryNode t, int k){
        if(t != null){
            BSTFind(t.right, k);
            if(t.data >= k) System.out.println(t.data);
            BSTFind(t.left, k);
        }
    }
}

