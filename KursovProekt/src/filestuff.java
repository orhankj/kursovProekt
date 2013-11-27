import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class filestuff {
	private static BufferedReader br;




	static void writeToFile(String tip, String model, int age, short seats, double loadcap,
			double fuelspent,String nodes,float lenth, short daily) throws FileNotFoundException
	{
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("text.txt", true)));
		    out.println(
		    	tip+" "+model+" "+age+" "+seats+" "+loadcap+" "+fuelspent+" "+lenth+" "+daily+" "+nodes);
		  
		out.close();
		   } catch (IOException e) {}
	}
	
	
	
	
	static void readFromFile(String brand,int age) throws IOException{
		try
		  {
		  FileInputStream in = new FileInputStream("text.txt");
		  br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		 int count=0;  
		 String godini=null;
		 boolean flag=false;
		 boolean b=false;
		 System.out.println("brand-model-age-seats-carry cap-fuel-lenth-daily-route");
		  while((strLine = br.readLine())!= null)
		  {
			 b= strLine.contains(brand);
				if(b==true)
				{
			for(int i=0;i<strLine.length();i++)
			{
	           if(strLine.charAt(i)==' ')
	           {
	        	   count++;
	        	   if(count==2){
	        		   
	                godini=godini+strLine.charAt(i+1);
	        		
	        		  if(Character.isDigit(strLine.charAt(i+2)))godini=godini+strLine.charAt(i+2);
	        		  String parsegodini=godini.substring(4);//premahva null ot stoynosta na stringa
	        		  godini=null;
	        		   Integer god=new Integer(parsegodini);
	        	  if(god==age){
	        		  
	        		  System.out.println(strLine);flag=true;}
	               
	                          }//for if(count==2)
	        	                  }//for if(strLine.charAt(i)==' ')
	                                               }//for for(int i=0;i<strLine.length();i++){
			            }//for if(b==true)
				count=0;
				  }//for while
		 if(flag==false)System.out.println("No such taxi in the file");
		
		  }catch(Exception e){
		   System.out.println("Invalid input");
		  }
	}
	
	
	public static void deleteFromFile(String brand,String model) throws IOException
	{
		FileInputStream in=new FileInputStream("text.txt");
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("temp.txt", true)));
		String line;
		br = new BufferedReader(new InputStreamReader(in));
		while((line=br.readLine())!=null)
		{
			if(( line.contains(brand))==true &&( line.contains(model)==true))
					{
				          continue;
		            }
			else 
				    out.println(line);
	    }

	    out.close();
	    in.close();
	    File oldFile = new File("text.txt");
	    File newFile = new File("temp.txt");
	    oldFile.delete();
	    newFile.renameTo(oldFile);
	   }
	
	
}
