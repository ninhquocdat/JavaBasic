package bt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class BaiL {
	public static void main(String[] args) throws FileNotFoundException {
		Stack<Integer> st = new Stack<>();
		Scanner  sc = new Scanner(new File("A.txt"));
		boolean fl = false;
		while(sc.hasNext()){
			String s = sc.next();
			switch (s) {
			case "push":
				st.push(sc.nextInt());
				break;
			case "show":
				if(fl==true){
					System.out.println();
				}else{
					fl = true;
				}
				if(st.isEmpty()){
					System.out.print("empty");
				}else{
					for(int i=0;i<st.size();i++){
						System.out.print(st.get(i));
						if(i<st.size()-1){
							System.out.print(" ");
						}
					}
					
				}
				break;
			case "pop":
				st.pop();
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
