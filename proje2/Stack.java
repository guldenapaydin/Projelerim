public class Stack{
    
    private Node top;
    
    public Stack()
    {
        top = null;
    }
    
    public boolean isEmpty()
    {
        return( top == null);
    }
    
 /*   public void push(int key) // ekleme işlemi
    {
        top= new Node(key,top);
    }
    */
    
    
    // Aşağıdaki iki metodu yazdı bu şekilde.
    
    public void push(int  key)
    {
        Node node= new Node(key,top);
        top = node;
        //top=new Node(key,top);
    }
    
    public void push(Node node)//pushToStack
    {
        node.setNext(top);//if next is not to top yet.
        top = node;
    }
     Buraya kadar olan kısım //
    
    
    
    
    
    
    
    public Node pop()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            Node node = top;
            top = top.getNext();
            return node;
        }
    }
    
    public void list()
    {
        Node current = top;
        while (current!=null)
        {
            System.out.pritln(current.toString());
            current = current.getNext();
        }
    }
    
    
    
    
    
    
}