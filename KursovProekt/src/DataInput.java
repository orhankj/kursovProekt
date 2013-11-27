import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class DataInput {
  private static String marka = null;
  private static	 String modela = null;
  private static	 int godini = 0;
  private static	 short  sedalki = 0;
  private static	 double tovaraemost = 0;
  private static	 double gorivonasto = 0;
  private static	taxi taksi=new taxi(marka,modela,godini,sedalki,tovaraemost,gorivonasto);
  private static	short obikolki=0;
  private static	float daljina=0;
  private static	String vazli=null;
  private static	route pat=new route(daljina,obikolki,vazli);
  private static  Scanner input = new Scanner(System.in);  
	
	
	public static void WriteToFile() throws FileNotFoundException{
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
          
	}
	
	public static void ReadFromFile() throws IOException{
		input.nextLine();
    	System.out.println("Please enter the brand of the taxi");marka=input.nextLine();
        do{  System.out.println("Please enter the age of the taxi,must be positive and less than 11");
        godini=input.nextInt();
        }while(godini<0 || godini>10);
        taksi.setBrand(marka);taksi.setAge(godini);           
 	filestuff.readFromFile(taksi.getBrand(),taksi.getAge());
 	taksi.toString();
	}
	
}
