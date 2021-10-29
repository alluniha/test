package Com.sonata;

public class Largetwonum {

		public static void main(String args [])
		{
			int arr [] = {32,12,123,6,22,5,55,44,98,52,78,43};
			int n=arr.length-1;
			int temp;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(arr[n-1]+" "+arr[n]);
		}

	}

