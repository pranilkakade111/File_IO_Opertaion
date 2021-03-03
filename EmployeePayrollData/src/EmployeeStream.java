import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeStream {
	
	public static void readFromFile() throws IOException,ClassNotFoundException
	{
		FileInputStream input=null;
        ObjectInputStream obinput=null;
        
         input=new FileInputStream("E:\\practice_core\\Fileio\\src\\file_io");
         obinput=new ObjectInputStream(input);
         Payroll payroll = (Payroll)obinput.readObject();
         
         System.out.println(payroll.toString());
         
         input.close();
         obinput.close();      
	}
	
	private static void writeToFile(Payroll payroll)throws IOException  
	{
		FileOutputStream output=null;
        ObjectOutputStream o_output=null;
        
		output=new FileOutputStream("E:\\practice_core\\Fileio\\src\\file_io");
		
		o_output = new ObjectOutputStream(output);
		
		o_output.writeObject(payroll);
		System.out.println("succesfully written");
		output.close();
		o_output.close();	
	}
	
	public static void main(String[] args)throws IOException,ClassNotFoundException
	{	
		Scanner sc= new Scanner(System.in);
		
		Integer id;
		
		String name;
		 
	    Double salary;
	    
	    System.out.println("enter your id");
	    id=sc.nextInt();
	    
	    System.out.println("enter your name");
	    name=sc.next();
	    
	    System.out.println("enter your salary");
	    salary=sc.nextDouble();
	    
	    
	    Payroll payroll = new Payroll(id,name,salary);
	    writeToFile(payroll);

	    readFromFile();
	    sc.close();		
	}	
}
