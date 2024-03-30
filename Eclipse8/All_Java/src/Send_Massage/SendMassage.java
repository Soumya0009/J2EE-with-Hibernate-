package Send_Massage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SendMassage {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("----------------Welcome----------------");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the massage to send: ");
		String msg = sc.nextLine();
		System.out.print("How many times you want to send: ");
		int time = sc.nextInt();

		StringSelection selection = new StringSelection(msg);
		Clipboard cbd = Toolkit.getDefaultToolkit().getSystemClipboard();
		cbd.setContents(selection, null);
		
		Thread.sleep(5000);
		
		Robot robort = new Robot();

		for (int i = 1; i <= time; i++) {

			robort.keyPress(KeyEvent.VK_CONTROL);
			robort.keyPress(KeyEvent.VK_V);

			robort.keyRelease(KeyEvent.VK_CONTROL);
			robort.keyRelease(KeyEvent.VK_V);

			robort.keyPress(KeyEvent.VK_ENTER);
			robort.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("----------------Welcome----------------");
	}
}
