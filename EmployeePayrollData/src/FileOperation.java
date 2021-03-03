import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation 
{
	static Scanner sc= new Scanner(System.in);
	static boolean isExit=false;
	
		public static void create_Directory() 
	{
		System.out.println("enter the path you wanna to create directory");
		String path=sc.next();
		System.out.println("enter name of directory");
		path=path+sc.next();
		File folder=new File(path);
		boolean bool=folder.mkdir();
		
		if(bool)
		{
			System.out.println("directory is successfully created");
		}
		else 
		{
			
			System.out.println("directory is not created");
		}
		
	}
	

	public void create_file()
	{
		try {
		System.out.println("enter the name of the path");
		String filepath=sc.next();
		System.out.println("enter the name of file");
		filepath=filepath+sc.next();
		
		File file=new File(filepath);
		
		boolean check=file.createNewFile();
		if(check)
		{
			System.out.println("file is successfully created");
		}
		
		else 
		{
			System.out.println("oops !! file not created");
		}	
		
		}
		catch(IOException e)
		{
			System.out.println("exception happened");
			e.printStackTrace();
		}		
		
	}
	
	public void search() 
	{
		System.out.println("enter the path you wanna to search the directory");
		String path=sc.next();
		System.out.println("enter name of file type  you wanna to to search");
		String ext=sc.next();
		File file  =new File(path);
		
		FilenameFilter filter = new FilenameFilter() 
		{
			
			@Override
			public boolean accept(File dir, String name)
			{
				return name.endsWith(ext);
			}
		};
		
		String[] child= file.list(filter);
		
		if(child==null) 
		{
			System.out.println("directory doesn't exist orthe provided name is not directory");
		}
		else
		{
			for(int i=0 ; i<child.length ; i++)
			{
				
				String filename= child[i];
				System.out.println(filename);
			}
		}
		
		
	}

	public void search_folder() 
	{
		System.out.println("enter the path you wanna to search the directory");
		String path=sc.next();
		System.out.println("enter name of file type  you wanna to to search");
		String name_folder=sc.next();
		File file  =new File(path);
		
		FilenameFilter filter = new FilenameFilter() 
		{
			
			@Override
			public boolean accept(File dir, String name) 
			{
				return name.endsWith(name_folder);
			}
		};
		
		String[] child= file.list(filter);
		
		if(child==null) 
		{
			System.out.println("directory doesn't exist orthe provided name is not directory");
		}
		else
		{
			for(int i=0 ; i<child.length ; i++)
			{
				
				String filename= child[i];
				System.out.println(filename+ " is present");
			}
		}
	}
	public void Exit() 
	{
		isExit=true;
		System.out.println("bye !!! bye");
		
	}
	public static void main(String[] args) {
		while(!isExit) 
		{
		
		System.out.println("enter your choice of opration");
		System.out.println("1= for creation of folder");
		System.out.println("2= for creation of file");
		System.out.println("3= for searching of file");
		System.out.println("4= for searching folder");
		System.out.println("5= for exiting");

		
		int choice= sc.nextInt();
		switch(choice)
		{
		
		case 0 :
			new FileOperation().Exit();
			break;
		
		case 1:
			new FileOperation().create_Directory();
			break;
		
		case 2:
			new FileOperation().create_file();
			break;
			
		case 3 :
			new FileOperation().search();
			break;
			
		case 4 :
			new FileOperation().search_folder();
			break;
		
		}
		
	}	
		
	}
}
