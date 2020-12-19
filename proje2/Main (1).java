import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{   Scanner input = new Scanner(System.in);
	    Node node;
	    Stack stack = new Stack();
	    int key;
		System.out.println("Push key => ");
		key = input.nextInt();
		stack.push(key);
		stack.list();
	}
}
