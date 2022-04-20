package homework3;
import java.util.*;

class fraction {
    int x;
    int y;
}//fraction

public class Fractionalarithmetic{
	
        public static int greatestCommonDivisor(int a,int b) {   
        	int c;
    		while(b!=0){
    			c=a%b;
    			a=b;
    			b=c;
    		}
    		return a;
    	}
        public static int leastCommonMultiple(int a, int b) {
        	int g;
            g=greatestCommonDivisor(a,b);
        	int c=a*b/g;
        	return c;
    	}                                           //最大公约数、最小公倍数
        public static void addition(fraction i, fraction j) {
           	fraction result=new fraction();
           	int least=leastCommonMultiple(i.y,j.y);
           	int temp1=least/i.y;
           	int temp2=least/j.y;
           	result.x=i.x*temp1+j.x*temp2;
           	result.y=least;
           	int g=greatestCommonDivisor(result.x,result.y);
           	result.x/=g;
            result.y/=g;
            System.out.println(result.x+"/"+result.y);
        }
        public static void substration(fraction i,fraction j) {
        	fraction result=new fraction();
        	int least=leastCommonMultiple(i.y,j.y);
           	int temp1=least/i.y;
           	int temp2=least/j.y;
           	result.x=i.x*temp1-j.x*temp2;
           	result.y=least;
           	int g=greatestCommonDivisor(result.x,result.y);
           	result.x/=g;
            result.y/=g;
            System.out.println(result.x+"/"+result.y);
        }
        public static void multiplication(fraction i,fraction j) {
        fraction result=new fraction();
        result.x=i.x*j.x;
        result.y=i.y*j.y;
        int g=greatestCommonDivisor(result.x,result.y);
        result.x/=g;
        result.y/=g;
        System.out.println(result.x+"/"+result.y);
        }
        public static void division(fraction i,fraction j) {
        	fraction result=new fraction();
        	int temp=j.y;
        	j.y=j.x;
        	j.x=temp;
        	multiplication(i,j);     
        }//divison
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;
            while(in.hasNext()){
            n=in.nextInt();
            fraction i=new fraction();
            fraction j=new fraction();
            i.x=in.nextInt();
            i.y=in.nextInt();
            j.x=in.nextInt();
            j.y=in.nextInt();
                              //input两个分数
                    
            if(n==1) 
            addition(i,j);
            
            else if(n==2) 
            substration(i,j);
            
            else if(n==3) 
            multiplication(i,j);
            
            else
            division(i,j);
           
          }//while                                      //判断运算
    }//mian
  }//Main