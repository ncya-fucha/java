/**
 * イタリア料理人クラス
 * @author matsumotoaoi
 */
public class ItalianFoodCook {

	public void orderAndCooking() {
		System.out.println("　　[料理人]" + getProvision());
		System.out.println("　　[料理人]" + getCooking());
		System.out.println("　　[料理人]" + getServing());
	}

	public String getCookingName() {
		return "「カルボナーラ」";
	}

	private String getProvision() {
		return "「パスタ、卵黄、ベーコン、生クリーム、黒コショウを準備します。」";
	}

	private String getCooking() {
		return "「材料を茹でた後に炒めます。」";
	}

	private String getServing() {
		return "「細長いお皿に盛り付けます。」";
	}
}
