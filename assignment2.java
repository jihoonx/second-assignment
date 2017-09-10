import java.util.Scanner;

public class assignment2 {
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in); 
		System.out.print("Give me a sentence : ");
		String origin=sc.nextLine();
		
		System.out.print("Give me characters to delete :");
		String del=sc.nextLine();
		
		System.out.println("Original sentence : " + origin);
		
		
		for(int i =0; i<del.length();i++){
	          String delc = ""+del.charAt(i); 
	          origin=origin.replaceAll(delc, ""); 
	       //찾은 문자열 모두 삭제 
	    } 
		System.out.println("Modified sentence : " + origin); 
	}
}

