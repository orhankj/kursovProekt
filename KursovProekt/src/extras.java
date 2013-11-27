import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class extras {
private static BufferedReader br;

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

          public static void SortByFuelCost() throws IOException
          {
        	  FileInputStream in = new FileInputStream("text.txt");
    		  br = new BufferedReader(new InputStreamReader(in));
    		  String strLine;
    		 int count=0;  
    		 int loc1=0;
    		 int linecounter=0;
    		 String fuel=null;
    		ArrayList<Double> list=new ArrayList<Double>();
    		 double value = 0;
    		  while((strLine = br.readLine())!= null)
    		  {
    			  linecounter++;
    			    for(int i = 0;i<strLine.length();i++)
    			    {
    			    	
    			    	if(strLine.charAt(i)==' ')count++;
    			    		if(count==6)
    			    	{
    			    		fuel=strLine.substring(loc1-4, loc1);
    			    		 value = Double.valueOf(fuel);
    			    		 list.add(value);
    			    		
    			    		 
    			    		  continue;
    			    	}
    			    		loc1++;
    			    		
    			    }
    			   
    			    count=0;
    			    loc1=0;
    			    
    			    System.out.println(value);
    		  }
    		//  Collections.sort(list);
    		  for(Double l:list)System.out.println(l);
          }



}
