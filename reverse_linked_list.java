package CP_package;

public class reverse_linked_list {

    public static class TreeNode{
        int data;
        TreeNode next;
        TreeNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static TreeNode createRandomLinkedList(int size){
        TreeNode head=null;
        TreeNode curr=null;
        TreeNode prev=null;
        while (size>0){
            curr=new TreeNode(size*10);
            curr.next=prev;
            prev=curr;
            size--;
        }
        head=prev;
        return head;
    }
    public static void printlink(TreeNode head){
        TreeNode temp=head;
        if(temp==null){
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static TreeNode reverseLinkedList(TreeNode head){
        TreeNode rest=null;
        TreeNode presentNode=head;
        TreeNode pastNode=null;
        while(presentNode!=null){
            rest=presentNode.next;
            presentNode.next=pastNode;
            pastNode=presentNode;
            presentNode=rest;
        }
        head=pastNode;
        return head;
    }
    public static void main(String[] args) {
        TreeNode head=createRandomLinkedList(6);
        printlink(head);
        System.out.println();
        TreeNode newhead=reverseLinkedList(head);
        printlink(newhead);
    }
}
