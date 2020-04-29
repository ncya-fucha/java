/**JavaClass4
 * 税込価格を算出するクラス
 * @author matsumotoaoi
 */
public class Item {

	//フィールド
	private String name; //商品名
	private int price; //価格
	static final double TAX = 1.1;

	/**
	 * コンストラクタ
	 * @param name
	 * @param price
	 */
	Item(String name, int price) {
		setName(name); //setNameにmainメソッドのnameを引き渡す
		setPrice(price);
	}

	/**
	 * 商品名を取得
	 * @return name
	 */
	public String getName() {
		return name; //mainメソッドのnameに返す
	}

	/**
	 * 商品名を設定
	 * @param name
	 */
	public void setName(String name) {
		this.name = name; //このクラスのprivateのname = main関数のname
	}

	/**
	 * 価格を取得
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 価格を設定
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 税込価格算出メソッド
	 * @return taxPrice
	 */
	public int getPriceTax() {
		int taxPrice = (int) (this.price * TAX); //thisは「このクラス内の」という意味
		return taxPrice; //mainメソッドのgetPriceTax()に返す
	}
}
