package softwareEngineering.dataStructure.stracture;

/**
 * @author Einstein
 * @version 1.0
 * @description Todo
 * @date 2022/10/21 11:12
 * @see
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
