package com.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {

	public void createFile() throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Location to Store File");
		System.out.print("Enter : ");
		
		String s = sc.next()+sc.nextLine();
		
		File fh = new File(s);

		boolean isexists = fh.exists();
		if (isexists) 
		{
			System.out.println(fh.getName() + " is already exists");
		} 
		else 
		{
			boolean iscreated = fh.createNewFile();
			if (iscreated) 
			{
				System.out.println(fh.getName() + "file created Successfully");

			} 
			else
			{
				System.out.println("Something Went Wrong");
			}
		}

	}

	public void deleteFile() throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Location to Store File");
		System.out.print("Enter : ");
		
		String s = sc.next()+sc.nextLine();
		
		File file = new File(s);
		
		if (file.exists()) 
		{
			boolean del = file.delete();
			if (del)
			{
				System.out.println(file.getName() + "Delete Successfully");
			}
			else
			{
				System.out.println("File Not Deleted");
			}
		}
		else
		{
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Enter Location to Store File");
			System.out.print("Enter : ");
			
			String s1 = sc.next()+sc.nextLine();
			
			File file2 = new File(s1);
			
			boolean exists = file2.exists();
			
			if(exists)
			{
				System.out.println(file2.getName()+" already exist");
			}
			else
			{
				boolean newFile = file2.createNewFile();
				
				if(newFile)
				{
					System.out.println(file2.getName()+" is created successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
			}
		}
	}

	public void writeData() 
	{
	
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Location to Store File");
			System.out.print("Enter : ");
			
			String s = sc.next()+sc.nextLine();
			
			File file = new File(s);
			
			boolean isexist = file.exists();
			
			if(isexist)
			{
			
			FileWriter fw = new FileWriter(s);
		
			fw.write("this is a First line \n this is 2nd line ");
			fw.write("\n this is new line ");
			
			fw.close();

			System.out.println("Data Added Successfully");
			
			}
			else
			{
				System.out.println("File Not exists");
			}

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public void readFile() throws FileNotFoundException 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter Location to Store File");
		System.out.print("Enter : ");
		
		String s = sc1.next()+sc1.nextLine();
		
		File fr = new File(s);

		Scanner sc = new Scanner(fr);

		if (fr.canRead()) 
		{
			while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) throws IOException 
	
	{
		File_Handling t = new File_Handling();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1: For create file\nEnter 2: For delete file\nEnter 3: For write file\nEnter 4: For read file\n");
		System.out.print("Enter : ");
		int choise = sc.nextInt();

		switch(choise)
			{
				case 1 : t.createFile();
					break;

				case 2 : t.deleteFile();
					break;

				case 3 : t.writeFile();
					break;

				case 4 : t.readFile();
					break;

			}
		
	}

}
