package Session3;

import java.util.Arrays;

public class ArrayMethod {
		public static void main(String[] args) {
			
			//length of an Array
			int[] num = {10,20,20,40,50};
			System.out.println("Length of the num:"+num.length);
			//coping an array
			int[] source = {1,2,3,4,5};
			int[] destination = new int[5];
			
			//copy array
			System.arraycopy(source, 0,destination, 0,source.length);
			
			for(int i : destination) {
				System.out.print(i+" ");
			}
			//Array sort
			int[] b = {12, 8, 6, 45, 2};
			Arrays.sort(b);
			System.out.println(b);				
			
			//Array fill
			int[] d= new int[5];
			Arrays.fill(d, 1);
			Arrays.fill(d,1,4,2);// index from 1 to 4(n-1)-->index
			System.out.println(Arrays.toString(d));
		}
}
