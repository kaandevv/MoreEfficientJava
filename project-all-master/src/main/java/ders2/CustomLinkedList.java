package ders2;

public class CustomLinkedList {
    CustomNode head;

    public void addCustomNode(int data) {
        if (head == null) {
            head = new CustomNode(data);
        } else {
            CustomNode tempCustomNode = head;
            while (tempCustomNode.next != null) {
                tempCustomNode = tempCustomNode.next;
            }
            tempCustomNode.next = new CustomNode(data);
        }
    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addCustomNode(4);
        customLinkedList.addCustomNode(5);
        customLinkedList.addCustomNode(3);
        customLinkedList.addCustomNode(2);
    }
}


class CustomNode {
    int data;
    CustomNode next;

    CustomNode(int data) {
        this.data = data;
    }


}