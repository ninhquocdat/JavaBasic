package bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaiE {
	public static boolean checktn(String s) {
		if(s.equals(new StringBuilder(s).reverse().toString())){
			return true;
		}
		return false;
	}
	
	public static boolean checkch(String s){
		for(int i=0; i<s.length();i++){
			if((s.charAt(i)-'0') %2 != 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner  sc = new Scanner(new File("A.txt"));
		int n = sc.nextInt();
		while(n>0){
			String m = sc.next();
			if(checktn(m)&&checkch(m)){
				System.out.print("YES");
			}else{
				System.out.print("NO");
			}
			n--;
			if(n>0){
				System.out.println();
			}
		}
		sc.close();
	}
	

}
