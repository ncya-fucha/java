
public class Test {
	public static void main(String[] args) {
		int a = 1, b = 5, c = 10, ans = 0;
		
		sub1(a);
		System.out.println("a = " + a);
		b = a + sub2(b, 10);
		System.out.println("b = " + b);
		c = sub3(17.6);
		System.out.println("c = " + c);
		
		ans = sub1(a) + c;
		System.out.println("ans = " + ans);
	}
	
	public static int sub1(int x) {
		return sub2(x, 5);
	}
	
	public static int sub2(int x, int y) {
		return x + y;
	}
	
	public static int sub3(double x) {
		return (int) x * 2;	//xにだけキャスト変換	17*2
	}

}
