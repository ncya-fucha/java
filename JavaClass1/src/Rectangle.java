/**JavaClass1-1
 * 四角形を表すクラス
 * @author matsumotoaoi
 */
public class Rectangle {

	double width; //フィールド

	double height; //フィールド

	/**
	 * 面積計算メソッド
	 * @return area 面積
	 */
	double getArea() {
		double area = this.width * this.height;
		return area;

	}

}
