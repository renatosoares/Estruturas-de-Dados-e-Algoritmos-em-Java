package array_list;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; // allowed by autoboxing
		  List<Integer> listArr= Arrays.asList(arr); // error
		  Collections.shuffle(listArr);  // this has side effect of shuffling arr
		  System.out.println("arrList = " + listArr.toString()); // WRONG!
		  System.out.println("arrList = " + Arrays.deepToString(listArr.toArray()));

	}

}
