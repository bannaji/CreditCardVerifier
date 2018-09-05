package creditCardValidator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class main {

	private static Scanner sc;

	public static void main(final String args[]){
		System.out.println("\n\n\n**********************************CREDIT CARD VALIDATOR**********************************\n\n\n");
		System.out.println("Enter your card number: ");
		sc = new Scanner(System.in);
		String c_no=sc.next();
		int ok=valid(c_no);
		if(ok==1){
		System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}
	}
	
	public static int valid(String no){
		int l=no.length();
		//System.out.println("lenth is: "+l);
		System.out.println("\n\n");
		if(l>=13 && l<=16){
		int i,su=0,su_odd=0;;
		List<String> k=new ArrayList<>();
		String[] str=no.split("");
		for(i=l-1;i>0;i=i-2){
			int kk=Integer.parseInt(str[i]);
			//System.out.println("ith eleemt "+str[i]);
			int o=2*(kk);
			int ol=Integer.toString(o).length();
			int sum;
			if(ol>1){
				sum=(o%10)+(o/10);
			}
			
			else sum=o;
			k.add(Integer.toString(sum));
		}
//step2
	
		for(i=0;i<k.size();i++){
			su=su+Integer.parseInt(k.get(i));
		}
				
//step3
		
		for(i=l;i>0;i=i-2){
			su_odd=su_odd+(Integer.parseInt(str[i]));
		}
		//System.out.println("first letter "+str[1]);
		if((su+su_odd)%10==0){ 
			if((Integer.parseInt(str[1]))==4 || Integer.parseInt(str[1]) == 5 || Integer.parseInt(str[1])==6 ){
				System.out.print("Calculating");
				for(i=1;i<10;i++){
					System.out.print(".");
					try{Thread.sleep(500);}
					catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				System.out.println();
				return 1;}
		else 
		{
			System.out.print("Calculating.");
			for(i=1;i<10;i++){
				System.out.print("-");
				try{Thread.sleep(1000);}
				catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
			}
			System.out.println();
		return 0;
		}
		}
		else
			return 0;}
		else
			return 0;
	}
}