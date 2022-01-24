package week1.day2.Assignment1;

public class MissingElementInArray {

public static int MissingNumber(int[]nums) {
	int n=nums.length;
	int sum=((n+1)*(n+2))/2;
	for(int i=0;i<n;i++)
		sum-=nums[i];
	return sum;
}
public static void main(String[] args) {
int[] a= {1,2,3,4,6,7,8};
System.out.println(MissingNumber(a));

}
}
