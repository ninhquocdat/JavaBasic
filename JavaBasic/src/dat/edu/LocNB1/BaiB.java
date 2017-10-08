package bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BaiB {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner  sc = new Scanner(new File("A.txt"));
		int test = sc.nextInt();
		int j = 1;
		while(j<=test){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int A[] = new int [n];
			for(int i= 0;i <n;i++){
				A[i]= sc.nextInt();
			}
//			int B[] = new int [m];
			System.out.println("Test "+j+":");
			for(int i=0;i<p;i++){
				System.out.print(A[i]+" ");
			}
			for(int i=0;i<m;i++){
				System.out.print(sc.nextInt()+" ");
			}
			for(int i=p;i<n;i++){
				System.out.print(A[i]);
				if(i!=n-1){
					System.out.print(" ");
				}
			}
			j++;
			if(j<test){
				System.out.println();
			}
		}
		sc.close();
	}
}
