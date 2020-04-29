/**
 * @author matsumotoaoi
 */
public class RectangleTest {

	/**JavaClass1-2
	 * 2つの四角形の面積を計算し表示するメソッド
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {

		Rectangle area1 = new Rectangle(); //インスタンス
		//フィールドに値を設定
		area1.width = 8;
		area1.height = 12;
		//メソッドを呼び出して表示
		System.out.println("1つ目の四角形の面積は" + area1.getArea() + "です");

		Rectangle area2 = new Rectangle(); //インスタンス
		//フィールドに値を設定
		area2.width = 6.7;
		area2.height = 13.4;
		//メソッド呼び出して表示
		System.out.println("2つ目の四角形の面積は" + area2.getArea() + "です");

		calcTwoRectangles(area1, area2); //メソッド呼び出して表示

	}

	/**JavaClass1-3
	 * 2つの四角形の面積の合計と辺の長さの合計を計算し表示する
	 * @param area1 1つ目の四角形の面積
	 * @param area2 2つ目の四角形の面積
	 */
	static void calcTwoRectangles(Rectangle area1, Rectangle area2) {

		double sumArea = area1.getArea() + area2.getArea();
		System.out.println("2つの四角形の面積の合計は" + sumArea + "です");

		double sumLength = (area1.width + area1.height + area2.width + area2.height) * 2;
		System.out.println("2つの四角形の辺の長さの合計は" + sumLength + "です");

	}

}
