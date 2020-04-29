/**JavaClass3
 * StudentTestScoreの確認サンプル
 * @author matsumotoaoi
 */
public class StudentTestResult {

	/**
	 * mainメソッド
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {

		StudentTestScore[] scoreData = new StudentTestScore[4];

		scoreData[0] = new StudentTestScore("青空一郎", -1);
		scoreData[1] = new StudentTestScore("青空二郎", 0);
		scoreData[2] = new StudentTestScore("青空三郎", 100);
		scoreData[3] = new StudentTestScore(null, 101);

		//点数表示
		for (int i = 0; i < scoreData.length; i++) {
			System.out.println(scoreData[i].getName() + "さんの点数は" +
					scoreData[i].getScore() + "点です。");
		}

	}

}
