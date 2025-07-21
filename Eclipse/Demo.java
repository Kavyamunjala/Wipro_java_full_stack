package vector1;
import java.util.Vector;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Vector<String> months=new Vector<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<12;i++) {
			System.out.println("month"+(i+1)+": ");
			String a=scan.nextLine();
			months.add(a);
		}
		for(String a:months) {
			System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

}
