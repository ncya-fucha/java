import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer {

	public void order() throws Exception {
		//注文する
		System.out.println("料理の種類を選択してください。");
		System.out.println("-------------------------");
		System.out.println("1. 日本料理");
		System.out.println("2. 中華料理");
		System.out.println("3. イタリア料理");
		System.out.println("-------------------------");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num = Integer.parseInt(br.readLine());

		do {
			System.out.print("料理の種類(1-3):");
			if()
		} while(num < 1 || num > 3);

		switch(num) {
		case 1:
			Waiter.orderJapaneseFood();
			break;
		case 2:
			Waiter.orderChineseFood();
			break;
		case 3:
			Waiter.orderItalianFood();
			break;
		}
	}

}
