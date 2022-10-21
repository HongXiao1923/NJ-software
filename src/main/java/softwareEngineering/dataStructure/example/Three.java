package softwareEngineering.dataStructure.example;

import softwareEngineering.dataStructure.stracture.BinaryNodeLsize;

/**
 * @author Einstein
 * @version 1.0
 * @description 递归找二叉搜索树中第k个小的关键码结点
 *              结点结构：Lsize, left, data, right (Lsize的值为该结点左子树中结点个数加1)
 * @date 2022/10/21 10:56
 * @see
 */
public class Three {
    public BinaryNodeLsize findk(int k, BinaryNodeLsize node){
        if(k == node.Lsize)     return node;
        if(k < node.Lsize)      return findk(k, node.left);
        if(node.right == null)
            return null;
        else
            return findk(k - node.Lsize, node.right);
    }
}

