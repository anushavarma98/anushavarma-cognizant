import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
				
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		Integer [] arr = new Integer[list.size()];
		list.toArray(arr);
		System.out.println("Array: ");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.println(arr[i]+ ",");
				
		}

	}

}
