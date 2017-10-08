package bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaiA {
	public static boolean check(int A[], int m){
		int k = 0, h = m-1;
		while(h>k){
			if(A[h]!=A[k]){
				return false;
			}else{
				h--;
				k++;
			}
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner  sc = new Scanner(new File("A.txt"));
		int n = sc.nextInt();
		while(n>0){
			int m = sc.nextInt();
			int a[] = new int [m];
			for(int i=0;i<m;i++){
				a[i]=sc.nextInt();
			}
			if(check(a,m)){
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
