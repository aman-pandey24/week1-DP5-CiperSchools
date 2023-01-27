package CP_package;

public class Min_stack {
    static class Node {
        int value;
        int min;
        Node next;
        Node(int value,int min){
            this.value=value;
            this.min=min;
        }
    }
    static Node head;
    public static void push(int x){
        if (head==null){
            Node n=new Node(x,Math.min(x, head.min));
            head=n;
        }
        else {
            Node n=new Node(x,Math.min(x, head.min));
            n.next=head;
            head=n;
        }
    }
    public static void pop(){
        if (head!=null){
            head=head.next;
        }
    }
    public static int top(){
        if (head!=null){
            return head.value;
        }
        return -1;
    }
    public static int getMin(){
        if (head!=null){
            return head.min;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
