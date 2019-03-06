public class SLL{
    
    public Node head;

    public SLL(){
        this.head = null;
    }

    public Node remove(int value){
        Node current = this.head;
        if(current.value == value){
            this.head = current.next;
        }
        while(current.next.value != value){
            current = current.next;
            if(current.next.value == value){
                current.next = null;
            }
            if(current.next.next == null){
                return current;
            }
        }
        current.next = current.next.next;
        return current;
    }
    public void printValues(){
        if(this.head == null){
            System.out.println("Nothing in list");
        } else {
            Node current = this.head;
            while(current.next != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
    }
    public void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        } else {
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current = current.next;
        }
    }
}