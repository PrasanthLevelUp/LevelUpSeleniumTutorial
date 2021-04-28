package driversPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		add(x,y);
		
		File f = new File("G:\\Selenium Drivers\\test.txt");
		Scanner fsc = new Scanner(f);
		while(fsc.hasNext()) {
			System.out.println(fsc.next());
		}

	}
	
	public static void add(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}

}
