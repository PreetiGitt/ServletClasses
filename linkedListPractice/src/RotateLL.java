public class RotateLL {

    static void print(Node head){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    static void rotateLL(int k, Node head){
        if (k==0 || head==null)
            return;
        int length=0;
        Node temp=head;
        Node temp1=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }

        if (k>length)
            k=k-length;
        int iteration=length-k;
        System.out.println(length+"::K"+k);


        while(iteration!=1){
            temp1=temp1.next;
            iteration--;
        }
        System.out.println("--00"+temp1.val);//30
        Node temp2=temp1.next.next;//50
        temp2.next=head; //10
        head=temp1.next;//40
        temp1.next=null;
        print(head);
    }

    public static void main(String[] args) {

        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5= new Node(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        rotateLL(2,n1);




    }
}
