/**JavaClass4
 * 1割引きした税込価格を算出するクラス
 * @author matsumotoaoi
 */
public class DiscountItem extends Item { //継承

	//フィールド
	static final double DISCOUNT = 0.9;

	/**
	 * コンストラクタ
	 * @param name
	 * @param price
	 */
	DiscountItem(String name, int price) { //このクラス名と一致させるために記述
		super(name, price);//継承した下のクラス(Item)のコンストラクタをsuperで呼び出す
	}

	@Override //上書きする部分のみ
	public int getPriceTax() {
		int disPrice = (int) ((getPrice() * DISCOUNT) * TAX);
		return disPrice;
	}
}
