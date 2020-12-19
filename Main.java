import java.io.File.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main
{
    
    public static void main(String[] args) throws Exception
    {
       PrintWriter outfile= new PrintWriter(new File("triangle.text"));
       outfile.write("T 3 4 8 BLUE \n");
       outfile.write("T 4 5 7 RED");
       outfile.close();
       System.out.println("Dosyaya yazıldı");
       
       Scanner scanfile = new Scanner(new File("triangle.text"));	
       
   
       
       Triangle triangle1 = new Triangle();
       Triangle triangle2 = new Triangle();
       
       //index kullandik cunku hnagi satirda oldugumuzu bilmemiz icin. index 1 ise birinci ucgen olustur
       // index 2 ise yani else kousulu var ise ikinci ucgeni olustur
        int index = 0;
	    while(scanfile.hasNext())
	    {
	        //System.out.println(scanfile.nextLine());
	        String line=scanfile.nextLine();
	        
	        int triangleAttribute1 = Integer.parseInt(line.substring(2,3));
	        int triangleAttribute2 = Integer.parseInt(line.substring(4 ,5));
	        int triangleAttribute3 =Integer.parseInt(line.substring(6, 7));
	        String color = line.substring(7);
	        
            //her satir cagirildigindan index artirilir, cunku satir artiyor
	        index++;
	        
	        System.out.println(triangleAttribute1 + " " + triangleAttribute2 + " " + triangleAttribute3 + " " + color);
	        //ilk satir index 1 
	        if(index ==1) {
	        	triangle1 = new Triangle(triangleAttribute1, triangleAttribute2, triangleAttribute3, color);
	        	
	        }
	        // index ikinci satir, else if index == 2 bunu da diyeiblirdik yani ikinci satir
	        else {
	        	triangle2 = new Triangle(triangleAttribute1, triangleAttribute2, triangleAttribute3, color);

	        }
	       
	    }
	    
	    System.out.println("compare to: " + triangle1.compare(triangle2));
	    
	    System.out.println("equals : " + triangle1.equals(triangle2));
	   
	    //clone copy olusutruyor cclone metodu donus tipi Triangle
	    Triangle triangle3 = triangle2.clone(triangle2);
	    
	    System.out.println("compare to clone: " + triangle1.compare(triangle3));

        System.out.println("Dosya okundu.");
        scanfile.close();       
    }

}