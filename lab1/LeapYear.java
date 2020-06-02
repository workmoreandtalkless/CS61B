import java.util.*;
import java.util.Scanner;

public class LeapYear{
/** 
	@source 
*/
	public static boolean isLeapYear(int years){
		if(years%400==0) return true;
		else{
			if(years%4==0&&years%100!=0){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner newScan= new Scanner(System.in);
		int in=newScan.nextInt();
		if(isLeapYear(in)) System.out.println(in + " "+"is a leap year. ");
		else System.out.println(in +" "+"is not a leap year.");

	}

}