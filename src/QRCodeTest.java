import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class QRCodeTest {

	public static void main(String[] args) {
		String text = "http://www.baidu.com";
		String yundanhao = "403034892688";
		String myId="432828197407193013";
		// 不含Logo
		// QRCodeUtil.encode(text, null, "e:\\", true);
		// 含Logo，不指定二维码图片名
		// QRCodeUtil.encode(text, "e:\\csdn.jpg", "e:\\", true);
		// 含Logo，指定二维码图片名

		/*try {
			QRCodeUtil.encode(text, "e:\\hwm.jpg", "e:\\", true);
			System.out.println("二维码生成！");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		// try {
		// System.out.println(QRCodeUtil.decode("e:\\92542777.jpg"));
		// System.out.println("二维码解析！");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
/*
		try {
			QRCodeUtil.getBarcodeWriteFile(myId, 200, 10, new File("id.png"));
			System.out.println("一维码生成！");
		} catch (IOException e) {			
			e.printStackTrace();
		}*/
		
		try {
			System.out.println(QRCodeUtil.decode("id.png"));
			System.out.println("一维码解析！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
