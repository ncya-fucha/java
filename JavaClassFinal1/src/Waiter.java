
public class Waiter {

	private static final int JAPANESE_FOOD = 1;
	private static final int CHINESE_FOOD = 2;
	private static final int ITALIAN_FOOD = 3;

	public void orderJapaneseFood() {
		//日本料理の注文
		//order()メソッドの呼び出し
	}

	public void orderChineseFood() {
		//中華料理の注文
		//order()メソッドの呼び出し
	}

	public void orderItalianFood() {
		//イタリア料理の注文
		//order()メソッドの呼び出し
	}

	private void order(int selectNo) {
		//注文受付
		String cookingName = null;

		System.out.println("[ウェイター]注文が入りました。");

		switch(selectNo) {
		case 1:
			orderAndCooking();
			String getCookingName();
			break;
		case 2:
			break;
		case 3:
			break;
		}

		System.out.println("[ウェイター]お客様、こちら" + cookingName + "になります。");
	}

}
