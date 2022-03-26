package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		
		int arr[] = {3,2,11,4,6,7};
		int arr1[] = {1,2,8,4,9,7};
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr1.length; b++) {
				
					
			if(arr[a]==arr1[b]) {
				
				System.out.println(arr[a]);
			}
			}
		}
		
		

	}

}
