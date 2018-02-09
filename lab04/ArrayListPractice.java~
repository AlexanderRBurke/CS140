package lab04;
import java.util.ArrayList;
import  java.util.List;
import java.util.Iterator;

public class ArrayListPractice{

	public static int intRemoveAll(List<Integer> arr, int e){
		Iterator<Integer> iter = arr.iterator();
		int count = 0;
		while(iter.hasNext()){
	 	   if((Integer) iter.next() == e){ 
			iter.remove();
			count++;
			}
        	}
		return count;
	}

	public static boolean isEqual(List<Integer> alpha, List<Integer> other)	{	
		if(alpha.size() != other.size())
			return false;
		int index = 0; 
		for(int e: alpha){
			if(e!=other.get(index))
				return false;
			index++;		
		}
	
		return true;
	}

	public static void appendArray( List<Integer> arrList, Integer[] arr){
		if (arr == null)
			throw new IllegalArgumentException("Please provide a non null array");

		for(int i=0; i<arr.length;i++){
			arrList.add(arr[i]);
		}
	}

	public static List<Integer> sumElementWise(List<Integer> arr1, List<Integer> arr2){
		List<Integer> sum = new ArrayList<>();
		if(arr1==null || arr2 ==null)
			throw new IllegalArgumentException("Please provide non null lists");

		for(int e:arr1)
			sum.add(e);
		if(arr2.size()<=sum.size()){
			for(int i=0;i<arr2.size(); i++)
				sum.set(i,sum.get(i)+arr2.get(i));

		}
		else{
			for(int i=0;i<sum.size(); i++)
				sum.set(i,sum.get(i)+arr2.get(i));
			for(int i=sum.size();i<arr2.size(); i++)
				sum.add(arr2.get(i));
		}
		return sum;
	}

}



