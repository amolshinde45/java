package first;

public class for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{10,20},{40,50,60},{70,80,90}};
		for (int arr[]:a) {
			for (int ele:arr) {
				System.out.println(ele);
			}
		}
	}

}
