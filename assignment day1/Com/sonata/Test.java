package Com.sonata;

public class Test {
          public static void main(String args[]) 
        	  	{
        	  		int arr [] = {12,34,54,66,78,55,78};
        	  		int n=66;
        	  		boolean test=false;
        	  		for(int i=0;i<arr.length;i++)
        	  		{
        	  			if(arr[i]==n)
        	  			{
        	  				test=true;
        	  				break;
        	  			}
        	  		}
        	  		if(test)
        	  		{
        	  			System.out.println(n+"found");
        	  		}
        	  		else
        	  		{
        	  			System.out.println(n+"not found");
        	  		}
        	  		
        	  	}

        	  
          }

