package Question4;

public class ModifyArray {

	public static void main(String[] args) {
		int[] arr=new int[] {5,2,8,7,1};
		int temp=0;
		//Displayinng elements of orignal arry
       System.out.println("Elements of orginal array:");
       for(int i=0;i<arr.length;i++) {
       System.out.println(arr[i]+ "");
	}
   //sort the array in descending order
	for(int i=0;i<arr.length;i++) {
	for(int j=1+1;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
  System.out.println();
  //Displaying elements of array after sorting
  System.out.println("Elements of array sorted in descending order");
  for(int i=0;i<arr.length;i++) {
  System.out.println(arr[i]+"");
  int[] arr1=new int[] {1,2,3,4,1,2,3,5,6};
  System.out.println("Duplicate elements in given array");
  }
}
}
  