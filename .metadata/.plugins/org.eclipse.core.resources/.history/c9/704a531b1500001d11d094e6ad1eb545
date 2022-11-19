package M0dule2_assignment;

import java.util.Scanner;

public class As12_second_largest_number {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter length of an array : ");
		int n= sc.nextInt();
		
		
		int[] arr = new int [n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
			 
		}
		
	System.out.println();

	
	      for(int arr1 : arr)
	      {
	    	  System.out.print(arr1+" ");
	      }
	      
	      System.out.println();
	      
	      int maximum = arr[0];
	      int secMaximum = arr[1];
	      
	      for(int i=0;i<n;i++)
	      {
	    	  if(arr[i]>maximum || secMaximum == maximum)
	    	  {
	    		  secMaximum = maximum;
	    		  maximum = arr[i];
	    	  }
	    	  
	    	  else if (arr[i]> secMaximum && arr[i] !=maximum )
	    	  {
	    		  secMaximum = arr[i];
	    	  }
	      }
	      
	      System.out.println("Maximum element of an aray is : "+maximum);
	      System.out.println("Second Maximum element of an aray is : "+secMaximum);
	      
	      
	      
	}

}
