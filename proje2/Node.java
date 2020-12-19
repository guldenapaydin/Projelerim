public class Node{
   
   
    private int key;
    private Node next;
    
    public Node(int key, Node next) // appropriate for Stack ADT
    {
        this.key=key;
        this.next=next;
    }
    
    // new Node(5, null);
    // new Node(5);
    
    public Node(int key)
    {
        this.key;
        this.next=null;
    }
      public setNext(Node next)
    {
        this.next=next;
    }
    
     public int getKey()
    {
        return this.key;
    }
    
   public Node getNext()
    {
        return this.next;
    }
   
   @Override
   public String toString()
   {
       return(String.valueOf(this.key));
   }
    
}