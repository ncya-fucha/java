/**JavaClass2-1
 * OneDollarShopを画面表示するクラス
 * @author matsumotoaoi
 */
public class OneDollarShopTest {

	/**
	 * mainメソッド
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {

		OneDollarShop shinagawa = new OneDollarShop("品川店", "10:00~18:00");//インスタンス生成
		shinagawa.setSalesNumbers(1000);
		shinagawa.printStoreInfo();//メソッド呼び出し

		OneDollarShop nagoya = new OneDollarShop("名古屋店", "10:00~19:00");//インスタンス生成
		nagoya.setSalesNumbers(1100);
		nagoya.printStoreInfo();//メソッド呼び出し

		OneDollarShop osaka = new OneDollarShop("大阪店", "6:00~22:00");//インスタンス生成
		osaka.setSalesNumbers(1200);
		osaka.printStoreInfo();//メソッド呼び出し

	}

}
