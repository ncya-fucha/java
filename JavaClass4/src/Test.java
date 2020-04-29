/**JavaClass4
 *
 * @author matsumotoaoi
 */
public class Test {

	/**
	 * mainメソッド
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {

		//商品名と価格をインスタンス  コンストラクタに値を移動(呼び出し)
		Item A = new Item("商品A", 500);
		DiscountItem B = new DiscountItem("商品B", 500);

		//表示
		System.out.println("商品名：" + A.getName() + "  価格：" + A.getPrice() + "  税込価格：" + A.getPriceTax());
		System.out.println("商品名：" + B.getName() + "  価格：" + B.getPrice() + "  税込価格：" + B.getPriceTax());
	}
}
