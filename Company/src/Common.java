import java.util.Scanner;

public class Common 
{
//attributes..............................
protected String name;
protected String lastname;
protected String username;
protected String password;
protected int age;
protected int year;//salhaye faaliyat

Clerck A=new Clerck();

Scanner Sc=new Scanner(System.in);
 
//metodes.................................

public void Gettype()
{
    System.out.println("press'C' if you are a Clerck and press'M'if you are manegar");
    String gettype=Sc.nextLine();
    
    if(gettype.equals("C") || gettype.equals("c"))
    {
        A.enrollment();
    }
    if(gettype.equals("M") || gettype.equals("m"))
    {
        System.out.println("Enter your username");
        String username=Sc.nextLine();
        System.out.println("Enter your password");
        String password=Sc.nextLine();
        if(username.matches("a"/*Manager.username*/))
        {
            System.out.println("you logged in successfully");
        }
        if(!username.matches("a"/*Manager.username*/))
        {
            System.out.println("password or username is wrong,try again");
        }
     }
}
    
public void ReserveFood()
{
	System.out.println("\nenter 'reserve' to reserve a food");

	String x = Sc.nextLine();
	
	if(x.equals("reserve"))
	{
		System.out.println("\nyou requsted for reserving food"
				+ "\nwhich food you want to choose?"
				+ "\n1.first Type"
				+ "\n2.second type"
				+"\nenter 1 to choose first and 2 to choose second");
		
		Scanner getfood = new Scanner(System.in);
		int y= getfood.nextInt();
	
		if(y==1)
		{
			System.out.println("first food reserved for you successfully");
		}
	
		if(y==2)
		{
			System.out.println("second food reserved for you successfully");
		}
	
	}
}
}//end of class
  
