import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySumPair {

	public static void main(String[] args) {
		Integer arr[] = {20,10,30,40,50};
		int sum = 80;
		
		List<Integer> numList = new ArrayList<>();
		numList.addAll(Arrays.asList(arr));
		Collections.sort(numList);
		for(int i=0;i<numList.size();i++) {
			int valueToSearch = sum-arr[i];
			if(numList.contains(valueToSearch)) {
				System.out.println("PAir Exists.." +numList.get(i)+" "+valueToSearch+ " exists in List");
				break;
			}
		}
		
	}
}
