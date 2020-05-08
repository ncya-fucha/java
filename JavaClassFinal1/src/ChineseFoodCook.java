/**
 * 中華料理人クラス
 * @author matsumotoaoi
 */
public class ChineseFoodCook {

	public void orderAndCooking() {
		System.out.println("　　[料理人]" + getProvision());
		System.out.println("　　[料理人]" + getCooking());
		System.out.println("　　[料理人]" + getServing());
	}

	public String getCookingName() {
		return "「チャーハン」";
	}

	private String getProvision() {
		return "「お米、卵、長ネギを準備します。」";
	}

	private String getCooking() {
		return "「材料を炒めます。」";
	}

	private String getServing() {
		return "「八角形のお皿に盛り付けます。」";
	}

}
