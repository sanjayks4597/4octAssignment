
public class RemoveElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x= {1,2,4,5,7};
		int k=5;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==k)
			{
				continue;
			}
			else {
				System.out.print(x[i]+" ");
			}
		}
		

	}

}
