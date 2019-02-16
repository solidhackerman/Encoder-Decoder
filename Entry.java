import java.util.*;
public class Entry extends encode
{   
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int ch,k;
	   encode en=new encode();
       System.out.println("\n\nCODEX - Encoding and Decoding\n");
	   System.out.print("******************************\n\n");
	   while(true)
       {
           System.out.println("01. Encoder");
           System.out.println("02. Decoder");
           System.out.println("03. About Me");
		   System.out.println("04. Exit\n");
           System.out.print("Enter Your Choice : ");
           ch=sc.nextInt();
		   System.out.println(" ");
           switch(ch)
           {   case 1: en.codeencode();
		               break;
		       case 2: en.codedecode();
				       break;
		       case 3: AboutUs();
		               break;
		       case 4:System.exit(0);
               default: System.out.println("Wrong Entry");
		   }

	    }
	}
	public static void AboutUs()
	{ System.out.print("Developed By - Vihaan Sharma\n\n");
	  Scanner sc=new Scanner(System.in);
	  sc.nextLine();
    }  
}	

