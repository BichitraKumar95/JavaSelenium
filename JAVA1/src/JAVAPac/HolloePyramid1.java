package JAVAPac;

import java.util.Scanner;

public class HolloePyramid1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows...");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(i==num||j==1||j==(2*i-1))
				{
					System.out.print("*");
				}
					
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
