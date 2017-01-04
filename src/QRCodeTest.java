import java.util.HashMap;

public class QRCodeTest {

	public static void main(String[] args) {
		String text = "http://www.baidu.com";
		// 不含Logo
		// QRCodeUtil.encode(text, null, "e:\\", true);
		// 含Logo，不指定二维码图片名
		// QRCodeUtil.encode(text, "e:\\csdn.jpg", "e:\\", true);
		// 含Logo，指定二维码图片名
		/*
		 * try { QRCodeUtil.encode(text, "e:\\hwm.jpg", "e:\\", true); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		try {
			System.out.println(QRCodeUtil.decode("e:\\92542777.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
