package decimalto;

import java.util.Scanner;

public class DecimalTobase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int value=decimalfun(a,b);
		System.out.println(value);
	}
	public static int decimalfun(int a,int b) {
		String result="";
		while(a>0){
			if(a==1){
				result+="1";
				}
			else {
				result += String.valueOf(a % b);
				}
			a/=b;
		        }
		String res="";
		for (int i=0; i<result.length(); i++)
		{
			char ch= result.charAt(i); 
			res= ch+res; 
			}
		int rnum=Integer.parseInt(res);
		return rnum;
		    }
		

	}


