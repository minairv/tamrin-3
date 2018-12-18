//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.util.ArrayList;
import java.util.Scanner;

public class Clerck extends Common 
{
    ArrayList<String>list= new ArrayList<>();
    {
        for(int i=0;i=6;i++)
        {
            list.add("Clerck");
        }
    }
    private int offDay;
    
    Scanner s=new Scanner (System.in);
    
    public void enrollment()
    {
        System.out.println("Enter your name");
        String n=s.nextLine();
        System.out.println("Enter your username");
        String u=s.nextLine();
        System.out.println("Enter your password");
        String p=s.nextLine();
        System.out.println("ReEnter your name");
        String r=s.nextLine();
        
        if(p.equals(r))
        {
            System.out.println("your enrollment done succesfully");
	    list.add(name + lastname + password + username + age + year);
	    //add clerck to arraylist
        }
        else
        {
            System.out.println("password doesnt match,try again");
            //add Clerck to arraylist
        }
        
    }//end of enrollment
    
    public void getoff()
    {
        System.out.println("enter 'off' to go on vacation");
        
        String x=s.nextLine();
        
        if(x.equals("off"))
        {
            System.out.println("you request for being off");
            if(this.offDay>=3)
                    {
                        System.out.println("\n you can be offmore than 3 days");
                    }
            else
            {
                System.out.println("your request is done succesfully");
                this.offDay=this.offDay+1;
                System.out.println("number of days off:"+this.offDay);
            }
        }
    }//ens of getoff
 }//end of class
