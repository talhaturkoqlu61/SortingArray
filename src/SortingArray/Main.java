package SortingArray;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number to specify size of array which will be created:");
		int number=input.nextInt();
		int[]list=new int[number];
		for(int i=0;i<list.length;i++) {
			System.out.print(i+1+"."+"element:");
			int num=input.nextInt();
			list[i]=num;
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
	
		
		
	}

}
