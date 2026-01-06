    int data;
    Node next;
    //constructor
    Node(int n){
        data=n;
        next=null;
        
    }
    //getdata
    public void getdata(){
        System.out.println(data);}
}
class Main {
    public static void main(String[] args) {
        System.out.println("NAVYA");
        System.out.println("Bindu");
        Node n=new Node(5);
        Node b=new Node (6);
        System.out.println(n);
        n.getdata();
        b.getdata();
        
    }
}
