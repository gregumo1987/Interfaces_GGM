
public class Application1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RationalNumber r5 = new RationalNumber(4, 5);
		//prints out rational number
		System.out.println(r5);
		//-1.0 output means rationalNumber is less than number comparing to
		RationalNumber r6 = new RationalNumber(5, 2);
		System.out.println(r6.compareTo(7));
		//1.0 output means rationalNumber is greater than number comparing to
		RationalNumber r7 = new RationalNumber(5, 5);
		System.out.println(r7.compareTo(0));
		

	}
}
