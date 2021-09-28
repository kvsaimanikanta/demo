package com.sai;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to(s);
		Thread.sleep(5000);
		driver.close();
	}

}
