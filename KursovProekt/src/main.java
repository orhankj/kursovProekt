import java.io.IOException;
import java.util.Scanner;
public class main extends Exception{
private static Scanner input;

public static void main(String[] args) throws IOException{
	String marka = null;
	 String modela = null;
	 int godini = 0;
	 short  sedalki = 0;
	 double tovaraemost = 0;
	 double gorivonasto = 0;
	taxi taksi=new taxi(marka,modela,godini,sedalki,tovaraemost,gorivonasto);
	short obikolki=0;
	float daljina=0;
	String vazli=null;
	route pat=new route(daljina,obikolki,vazli);
	short a=0;
	input = new Scanner(System.in);  
  System.out.println("Please choose an option\n 1.Enter a new taxi and routes\n 2.Search for a taxi by brand and ange\n" +
  		"3.Delete taxis by brand and model");
  a=input.nextShort();
switch (a) {
     case 1: 
    	 System.out.println("How many cabs and routes would you like to enter");int n=input.nextInt(); input.nextLine();
    		for(int i=0;i<n;i++){
    		System.out.println("Please enter the name of the brand ");marka=input.nextLine();
    		System.out.println("Please enter the name of the model ");modela=input.nextLine();
    		do{
    	System.out.println("Please enter the age of the car, must be in the range of [0;10] "); godini=input.nextInt();
    	System.out.println("Please enter the number of seats, must be in the range of [1;6] ");sedalki=input.nextShort();
    	System.out.println("Please enter the carrying capacity,must be positive up to 10000kg ");  tovaraemost=input.nextDouble();
    	System.out.println("Please enter the fuel cost, must be positive up to 40 litres per 100km ");gorivonasto=input.nextDouble();
    	}while(godini<0 || godini>10 || sedalki<0 || sedalki>5 || tovaraemost<0 || tovaraemost>10000 
    	 || gorivonasto<0 || gorivonasto>40 );
    	       taksi.setBrand(marka); 
    	       taksi.setModel(modela); 
    	       taksi.setSeats(sedalki); 
    	       taksi.setLoadcap(tovaraemost);
    	       taksi.setFuelspent(gorivonasto); 
    	       taksi.setAge(godini);
    	       input.nextLine();
    	       do{
    	       System.out.println("Please enter the nodes of the route for example:A-B-C-D-A-...." +
    	       		"always divide them with '-'");vazli=input.nextLine();
    	 System.out.println("Please enter lenth of the route, must be a positive number!"); daljina= input.nextFloat();
    	       System.out.println("Please enter the daily rounds must be >1 ");  obikolki=input.nextShort();
    	       input.nextLine();
    	       }while(daljina<0 || obikolki<1);
    	       pat.setDaily(obikolki);pat.setLenth(daljina);pat.setNodes(vazli);
    	      
    	      filestuff.writeToFile(taksi.getBrand(),taksi.getModel(),taksi.getAge(),
    	taksi.getSeats(),taksi.getLoadcap(),taksi.getFuelspent(),pat.getNodes(),pat.getLenth(),pat.getDaily());
    		}
    	
               break;  
        case 2: 
        	  
        		System.out.println("Please enter the brand of the taxi");marka=input.nextLine();
            do{  System.out.println("Please enter the age of the taxi,must be positive and less than 11");
            godini=input.nextInt();
            }while(godini<0 || godini>10);
            taksi.setBrand(marka);taksi.setAge(godini);           
     	filestuff.readFromFile(taksi.getBrand(),taksi.getAge());
     	taksi.toString();
    
        	break;
        case 3:
        	System.out.println("Please enter the brand and model of the taxis you want to delete");
        	input.nextLine();
        	String b=input.nextLine();
        	String m=input.nextLine();
        	filestuff.deleteFromFile(b,m);
        	break;        
       
    }

	
		
	
	}
}
