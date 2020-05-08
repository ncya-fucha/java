/**
 * 日本料理人クラス
 * @author matsumotoaoi
 */
public class JapaneseFoodCook {

	public void orderAndCooking() {
		System.out.println("　　[料理人]" + getProvision());
		System.out.println("　　[料理人]" + getCooking());
		System.out.println("　　[料理人]" + getServing());
	}

	public String getCookingName() {
		return "「カレイの煮付け」";
	}

	private String getProvision() {
		return "「カレイ、ショウガ、ネギを準備します。」";
	}

	private String getCooking() {
		return "「材料を煮ます。」";
	}

	private String getServing() {
		return "「底の浅い大きめのお皿に盛り付けます。」";
	}

}
