package problem1;

import java.util.Scanner;

public class cricketTshirts {

	public static void main(String[] args) {
		double roundneck,collared, hooded;
		double totalcost,finalprice;
        double discount;
        int t,r,c,h;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter how many total t-shirt: ");
        t=sc.nextInt();
        System.out.println("enter how many round-neck: ");
        r=sc.nextInt();
        System.out.println("enter how many collared:");
        c=sc.nextInt();
        System.out.println("enter how many hooded:");
        h=sc.nextInt();
        if(t>=5&&t<=10) {
        	discount=0.1;	
        }
        else
        {
        	discount=0.2;	
        }
        totalcost=r*200+c*250+h*300; 
        finalprice = totalcost-(totalcost*(discount));
		System.out.println("Final price is Rs. "+finalprice);
	}

}
