import java.util.HashMap;

public class QRCodeTest {

	public static void main(String[] args) {
		String text = "http://www.baidu.com";
		// ����Logo
		// QRCodeUtil.encode(text, null, "e:\\", true);
		// ��Logo����ָ����ά��ͼƬ��
		// QRCodeUtil.encode(text, "e:\\csdn.jpg", "e:\\", true);
		// ��Logo��ָ����ά��ͼƬ��
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
