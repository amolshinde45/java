package first;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr={10,20,30,40,50,60,70,80,90};
	        Scanner scan=new Scanner(System.in);
	        
	        System.out.println("Enter Key");
	        
	        int key=scan.nextInt();
	        
	        int low=0;
	        int high=arr.length-1;
	        
	        while(low<=high) {
	        	
	          int mid=low+high/2;
	        	
	        	if(key==arr[mid]) {
	        		
	        		System.out.println("Key is found out at index:"+mid);
	        		
	        		break;
	        	}
	        	else if(key <arr[mid]) {
	        		high=mid-1;
	        	}
	        	else if(key>arr[mid]) {
	        		low=mid+1;
	        	}
	        	
	       if(low>high) {
	    	   System.out.println("key not found");
	       }
	        }
	        
	        
	        
	}

}
