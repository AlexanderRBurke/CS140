package lab03;
import java.util.Arrays;
public class ArrayTester{

	public static void main(String [] args){
		int len = args.length;

		if(len == 1){
			ArrayFromFile obj = new ArrayFromFile(args[0]);	
			System.out.println(" I expect to see: 20 8 13 46 7");
			System.out.println(obj);
			obj.removeOddElements();
			System.out.println(" I expect to see: 20 8 46");
			System.out.println(obj);
		}
		else{
			throw new IllegalArgumentException("The program requires exactly one argument");	
		}

		int [] array = new int[5];
		System.out.println(Arrays.toString(array));
		int n = 0;
	for (int i : array) {
   		 i = n;
    		 n++; // shorthand to increment by 1
		}
		System.out.println(Arrays.toString(array));
	
	String[] strArr= {"A","BB","CCC", "DDDD"};

	for (String i : strArr) {
		System.out.println(i + " " + i.length());
	}

	}


}
