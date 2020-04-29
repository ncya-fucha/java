/**JavaClass5
 * FileCheckAbstract(抽象)クラスを継承した具象クラス
 * @author matsumotoaoi
 */
public class PdfFileCheck extends FileCheckAbstract { //継承

	/**
	 * pdfを戻すメソッド
	 */
	@Override
	protected String getExtension() {
		return "pdf";
	}

}
