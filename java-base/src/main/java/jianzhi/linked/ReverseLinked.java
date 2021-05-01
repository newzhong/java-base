package jianzhi.linked;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <b>功能描述:输入一个链表，按链表从尾到头的顺序返回一个ArrayList。</b><br>
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2021-04-18 16:43 
 */
public class ReverseLinked {

    class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    /***
     * 采用链表
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> result = new LinkedList<>();
        while(listNode != null){
            result.addFirst(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList(result);
        return arrayList;

    }
}