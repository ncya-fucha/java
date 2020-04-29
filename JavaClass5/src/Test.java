/**JavaClass5
 * FileCheckAbstractをテストするクラス
 * @author matsumotoaoi
 */
public class Test {

	/**
	 * mainメソッド
	 * @param args コマンドライン引数
	 */
	public static void main(String[] args) {
		textOrPdfCheck("textFile.txt");
		textOrPdfCheck("pdfFile.pdf");
		textOrPdfCheck("excelFile.xls");
	}

	/**
	 * textかpdfを判別するメソッド
	 * @param fileName
	 */
	private static void textOrPdfCheck(String fileName) {

		//TextFileCheckクラスにアップキャスト
		FileCheckAbstract fileChk = new TextFileCheck();
		if (!fileChk.isFileExtension(fileName)) { //()内がわからない
			System.out.println(fileName + "はテキストファイルではありません。");
		} else {
			System.out.println(fileChk.toString());//意味がわからん
			System.out.println(fileName + "はテキストファイルです。");
			return;
		}

		//PdfFileCheckクラスにアップキャスト
		fileChk = new PdfFileCheck();
		if (!fileChk.isFileExtension(fileName)) {
			System.out.println(fileName + "はPDFファイルではありません。");
		} else {
			System.out.println(fileChk.toString());
			System.out.println(fileName + "はPDFファイルです。");
			return;
		}

		System.out.println(fileName + "はテキストファイルでもPDFファイルでもありません。");

	}
}
