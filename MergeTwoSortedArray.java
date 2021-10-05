
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int a[] = {4,5,6,7,8};
		int b[] = {1,2,3,4};
		int c[] =new int[(a.length+b.length)];
		
		for(int i=0;i<c.length;i++)
		{
			if(i<b.length)
			{
				c[i]=b[i];
			}
			else {
				c[i]=a[i-b.length];
			}
			
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
