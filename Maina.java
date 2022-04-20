package homework3;
import java.util.*;

	public class Maina {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x,i,j;
	        while(in.hasNext()) {
	        x=in.nextInt();
	        int n,m,k,s;
	     if(x==3) {
	         n=in.nextInt();
	         m=in.nextInt();
	         k=in.nextInt();
	         int[][]a=new int[n][m];
	         int[][]b=new int[m][k];
	         int[][]result=new int[n][k];
	         for(i=0;i<n;i++) 
		    	 for(j=0;j<m;j++) 
		    		 a[i][j]=in.nextInt();       //input a
	         for(i=0;i<m;i++) 
		    	 for(j=0;j<k;j++) 
		    		 b[i][j]=in.nextInt();       //input b
	       /*  for(i=0;i<n;i++) { 
		    	 for(j=0;j<m;j++) 
		    		System.out.print(a[i][j]);
	                System.out.println(); }       //out a
	         for(i=0;i<m;i++) { 
		    	 for(j=0;j<k;j++) 
		    		System.out.print(b[i][j]);
	                System.out.println(); 
	              }                               //out b*/
	         for(i=0;i<n;i++) 
	        	 for(j=0;j<k;j++)
	        		 for(s=0;s<m;s++)
	        		 result[i][j]+=a[i][s]*b[s][j];
	         for(i=0;i<n;i++) {
	        	 j=0;
	        	 System.out.print(result[i][j]);
	        	 for(j=1;j<k;j++)
	        		System.out.print(" "+result[i][j]);
	             System.out.println(); 
	         }
	         }
	         
	     else{
	        	 n=in.nextInt();
		         m=in.nextInt();	
		         int[][]a=new int[n][m];
			     int[][]b=new int[n][m];
			     int[][]result=new int[n][m];
			     for(i=0;i<n;i++) {
			    	 for(j=0;j<m;j++) {
			    		 a[i][j]=in.nextInt();
			    	 }	    	 
			     }//input a
			     for(i=0;i<n;i++) {
			    	 for(j=0;j<m;j++) {
			    		 b[i][j]=in.nextInt();
			    	 }	    	 
			     }//input b	
			  /*   for(i=0;i<n;i++) { 
			    	 for(j=0;j<m;j++) 
			    		System.out.print(a[i][j]);
		                System.out.println(); }       //out a
		         for(i=0;i<n;i++) { 
			    	 for(j=0;j<m;j++) 
			    		System.out.print(b[i][j]);
		                System.out.println(); }       //out b*/
			     if(x==1)
			     //addition(a[][],b[][]);
			     {
			    	 for(i=0;i<n;i++)
			    		 for(j=0;j<m;j++)
			    			 result[i][j]=a[i][j]+b[i][j];
			     }
			     else
			     //substration(a[][],b[][]);
			     {
			    	 for(i=0;i<n;i++)
			    		 for(j=0;j<m;j++)
			    			 result[i][j]=a[i][j]-b[i][j];
			     }
			     for(i=0;i<n;i++) { 
			    	 j=0;
		        	 System.out.print(result[i][j]);
		        	 for(j=1;j<m;j++)
		        		System.out.print(" "+result[i][j]);
		             System.out.println(); 
		         }
			    	 
	          }
	       	
	          	
	        }//while
   }//main   	
}//Main
