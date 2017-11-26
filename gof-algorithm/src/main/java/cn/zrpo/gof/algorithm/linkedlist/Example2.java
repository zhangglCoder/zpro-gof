package cn.zrpo.gof.algorithm.linkedlist;

import cn.zrpo.gof.algorithm.linkedlist.support.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 链表测试
 * @author zhanggl
 */
public class Example2 {



    public static void main(String[] args) {
        Example2 example1 = new Example2();

        Node linkedList = example1.createLinkedList(Arrays.asList(1, 2, 3, 4, 54, 3));
        Node reverse = example1.reverse(linkedList);
        print(reverse);
        /*linkedList = example1.createLinkedList(Arrays.asList(1));
        print(linkedList);
        linkedList = example1.createLinkedList(Collections.EMPTY_LIST);
        print(linkedList);*/

    }

    private static void print(Node linkedList) {
        while (linkedList!= null){
            System.out.print(linkedList.getValue());
            linkedList = linkedList.getNext();
            if(linkedList != null){
               System.out.print("---");
            }
        }
        System.out.println();
    }

    /**
     * 创建单向链表
     * @param data
     */
    public Node createLinkedList(List<Integer> data){
        if(data.isEmpty()){
            return null;
        }
        Node firstNode = new Node(data.get(0));
        Node linkedList = createLinkedList(data.subList(1, data.size()));
        firstNode.setNext(linkedList);
        return firstNode;
    }

    /**
     * 反转
     * @param node
     * @return
     */
    public Node reverse(Node node){
        if(node == null || node.getNext() == null){
            return node;
        }
        Node newReverseLinkedList = reverse(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);
        return newReverseLinkedList;
    }

}
