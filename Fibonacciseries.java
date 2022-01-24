package week1.day2.Assignment1;

public class Fibonacciseries {
public static void main(String[] args) {
	int range=8,firstNum=0, secNum=1;
	int sum;
	System.out.println(firstNum);
	System.out.println(secNum );
	System.out.println("Fibonacciseries  range : " + range);
	for (int i = 0; i <range; i++) {
		sum =firstNum + secNum ;
		firstNum = secNum ;
		secNum=sum;
	System.out.println(sum);
	
	}

}

}



