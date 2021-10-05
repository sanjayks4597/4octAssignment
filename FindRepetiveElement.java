import java.util.Scanner;

public class FindRepetiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your array element of size 8 :");
		int []x=new int[8];
		
		for(int i=0 ;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if((x[i]^x[j])==0)
				{
					System.out.println("Repeating element is:"+x[i]);
					break;
				}
			}
		}

	}

}
