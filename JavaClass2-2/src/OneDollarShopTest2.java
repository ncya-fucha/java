/**JavaClass2-1
 * OneDollarShop2を画面表示するクラス
 * @author matsumotoaoi
 */
public class OneDollarShopTest2 {

	/**
	 * mainメソッド	親会社名に「CanYou」を設定し表示
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {

		OneDollarShop2 shinagawa = new OneDollarShop2("品川店", "10:00~18:00");//インスタンス生成
		shinagawa.setSalesNumbers(1000);
		shinagawa.printStoreInfo();//メソッド呼び出し

		OneDollarShop2 nagoya = new OneDollarShop2("名古屋店", "10:00~19:00");//インスタンス生成
		nagoya.setSalesNumbers(1100);
		nagoya.printStoreInfo();//メソッド呼び出し

		OneDollarShop2 osaka = new OneDollarShop2("大阪店", "6:00~22:00");//インスタンス生成
		osaka.setSalesNumbers(1200);
		osaka.printStoreInfo();//メソッド呼び出し

		OneDollarShop2.setParentCompany("CanYou"); //メソッド呼び出し

		//メソッド呼び出し
		shinagawa.printStoreInfo();
		nagoya.printStoreInfo();
		osaka.printStoreInfo();
	}

}
