// Little Elephant Candies problem 

package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Elephant class

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NTestcase;
		String arr[] = new String[100];
		Scanner in = new Scanner(System.in);
		Ex obj = new Ex();
		
		NTestcase = in.nextInt();
		for(int v=0;v<NTestcase;v++) {
			
			int c = obj.fun();
			//System.out.println(c);
			
				if(c>0) {
					arr[v]="Yes";
				}
				if(c==0){
					arr[v]="No";
				}
		}
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
	
		for(int d=0;d<NTestcase;d++) {
			System.out.println(arr[d]);
		}
	}

}

class Ex{
	int NElephants=0 , NCandies=0;
	//int Nseries[] = new int[20];
	String arr[] = new String[100];
	int len=0;
	int p=0;
	int c;
	int m=0;
	ArrayList<Integer> Nseries = new ArrayList<Integer>();
	Scanner in = new Scanner(System.in);
	public int fun() {
	
		//System.out.println("Hello");
		
			NElephants = in.nextInt();
			NCandies = in.nextInt();
			
			//System.out.println(NElephants);
			//System.out.println(NCandies);
			
			for(int j=0;j<NElephants;j++) {
				int b = in.nextInt();
				Nseries.add(b);
			}
			
			int len=Nseries.size();
			
			//System.out.println(len);
			
			//System.out.println(Nseries);
			
			for(int k=0;k<len;k++)
			{
				if(k>=len-1) {
					break;
				}
				else if(Nseries.get(0)==Nseries.get(k+1)) {
					//System.out.println("Happy");
					c=1;
					//System.out.println(c);
				}
				else {
					c=0;
				}
			}
			
			Nseries.clear();
			return c;
}
}
