package lab03;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFromFile{
	private int[] array;


	public ArrayFromFile(String filename) {
    		// try-with-resources block (sc is the resource we are trying to use)
    		try (Scanner sc = new Scanner(new File(filename))) {
			int len = sc.nextInt();
			array = new int[len];
			for(int i = 0; i<len; i++){
				array[i] = sc.nextInt();	
			}
		
    		} catch (Exception e) {
			array = new int[0];
    		}
	}

	public int[] getArray(){
		return array;
	}

	public String toString(){
		return Arrays.toString(array);	
	}

	public void removeOddElements(){
		int numEven = 0;
		for(int i: array){
			if(i%2 == 0)
				numEven++;
		}
		int[] tempArr = new int[numEven];
		int index = 0;
		for(int i: array){
			if(i%2 == 0){
				tempArr[index] = i;
				index++;
			}
		}
		array = tempArr;
	}




}
