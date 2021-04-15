package node;

/**
 * @author newzhong
 * @deprecated 单链表
 */
public class LinkedNode {
    /*** 头节点*/
    private Node head;
    /*** 尾节点*/
    private Node last;
    /*** 长度*/
    private int length;

    /**
     * 链表结果
     */
    private static class Node{
        /**
         * 节点数据
         */
        int data;
        /***
         * 指向下个节点的指
          */
        Node next;

        /**
         *  初始化
         * @param data
         */
        Node (int data){
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    /***
     * @deprecated 查找指定位置的节点Node
     * @param index
     * @return
     */
    public Node searchByIndex(int index){
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException("超出链表访问");
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    /***
     * @deprecated 指定链表插入位置
     * @param data
     * @param index
     */
    public void insertNode(int data, int index){
        if (index < 0 || index > length){
            throw new IndexOutOfBoundsException("超出链表访问");
        }
        Node newNode = new Node(data);
        // 初始化
        if (length == 0){
            head = newNode;
            last = newNode;
        }else if(length == index){
            last.next = newNode;
            last = newNode;
        }else {
            // 找插入的位置上个节点
            Node preNode = searchByIndex(index - 1);
            Node nextNode = preNode.next;
            preNode.next = newNode;
            newNode.next = nextNode;
        }
        length++;
    }

    /**
     * 输出节点
     */
    public void printNodeData(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node removeNode(int index){
        if (index < 0 || index > length){
            throw new IndexOutOfBoundsException("超出链表访问");
        }

        Node removeNode = null;
        // 删除头节点
        if(index == 0){
            removeNode = head;
            head = head.next;
        }else if(index == length - 1){
            Node preNode = searchByIndex(index - 1);
            preNode.next = null;
            last = preNode;
            removeNode = preNode.next;
        }else{
            // 中间删除
            Node preNode = searchByIndex(index - 1);
            removeNode = preNode.next;
            preNode.next = preNode.next.next;
        }
        length--;
        return removeNode;

    }
    public static void main(String[] args) {
        LinkedNode linkedNode = new LinkedNode();
        linkedNode.insertNode(1,0);
        linkedNode.insertNode(2,1);
        linkedNode.insertNode(3,2);
        linkedNode.insertNode(4,3);
        linkedNode.insertNode(5,4);
        linkedNode.insertNode(6,5);
        linkedNode.insertNode(7,6);
        linkedNode.removeNode(3);
        linkedNode.removeNode(5);
        linkedNode.printNodeData();
    }
}
