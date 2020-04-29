/**JavaClass2-1
 * 店舗を表すクラス
 * @author matsumotoaoi
 */
public class OneDollarShop {

	//フィールド
	static final String DEFAULT_PARENT = "ダイコー"; //定数の親会社名	初期値
	private static String parentCompany = DEFAULT_PARENT; //親会社名
	private int salesNumbers; //販売数
	private String storeName; //店舗名
	private String businessHours; //営業時間

	/**
	 * コンストラクタ
	 * @param storeName 店舗名
	 * @param businessHours 営業時間
	 */
	OneDollarShop(String storeName, String businessHours) {
		this.storeName = storeName;
		this.businessHours = businessHours;
	}

	/**
	 * 販売数取得メソッド	ゲッタ
	 * @return	salesNumbers 販売数
	 */
	public int getSalesNumbers() {
		return salesNumbers;
	}

	/**
	 * 販売数設定メソッド	セッタ
	 * @param salesNumbers 販売数
	 */
	public void setSalesNumbers(int salesNumbers) {
		this.salesNumbers = salesNumbers;
	}

	/**
	 * 店舗名取得メソッド	ゲッタ
	 * @return storeName 店舗名
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * 店舗名設定メソッド	セッタ
	 * @param storeName 店舗名
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * 営業時間取得メソッド		ゲッタ
	 * @return businessHours 営業時間
	 */
	public String getBusinessHours() {
		return businessHours;
	}

	/**
	 * 営業時間設定メソッド		セッタ
	 * @param businessHours 営業時間
	 */
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	/**
	 * 売上高算出メソッド
	 * @return salesNumbers * 100 売上高
	 */
	public long getSales() {
		return this.salesNumbers * 100;
	}

	/**
	 * 表示メソッド	StringBuilder
	 */
	public void printStoreInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(parentCompany);
		sb.append("「");
		sb.append(this.storeName);
		sb.append("」の営業時間は「");
		sb.append(this.businessHours);
		sb.append("」で、売上高は");
		sb.append(getSales());
		sb.append("円です。");
		String str = sb.toString();
		System.out.println(str);
	}
}
