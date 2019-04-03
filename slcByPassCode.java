package com.herokuapp.theinternet;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class slcByPassCode {

	public static void main(String[] args) {

		// Only need the following bit of Codes for accessing external test websites
		// while at SLC

		// This part goes in before the webdriver gets called
		// Take in Username
		String userName1 = JOptionPane.showInputDialog(null, "Enter Username: ");
		// Take in Password
		JPasswordField pf = new JPasswordField();
		String passWord1 = null;
		int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		if (okCxl == JOptionPane.OK_OPTION) {
			passWord1 = new String(pf.getPassword());
		}

		// This part goes in after the webpage has been called
		// Send Username to Field
		sleep(5000);
		WebElement userName = driver.findElement(By.id("i0116"));
		userName.sendKeys(userName1);
		driver.findElement(By.id("idSIButton9")).click();
		// Send Password to Field
		sleep(3000);
		WebElement passWord = driver.findElement(By.id("i0118"));
		passWord.sendKeys(passWord1);
		driver.findElement(By.id("idSIButton9")).click();
		sleep(3000);

	}
	
	
	//Sleep part goes outside the main block
	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
