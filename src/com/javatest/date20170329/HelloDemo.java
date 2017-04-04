package com.javatest.date20170329;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


class LogicException extends Exception{

	public LogicException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param message 表示当前异常的原因、信息
	 * @param cause	当前异常的根本原因
	 */
	public LogicException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LogicException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class HelloDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello GitHub!");
		
		sayHello();
		CalendarDemo();
		
		DateUtil();
		System.out.println(RegexDemo("1234"));
		
		whyDemo();
		
		sigleCatchDemo();
		
		test1();

	}

	//Java7之前手动资源关闭
	private static void test1() {
		// TODO Auto-generated method stub
		
	}
	
	//java7开始自动资源关闭
	private static void sigleCatchDemo() {
		// TODO Auto-generated method stub
		System.out.println("begin.....");
		try{
			int ret = 10/0;
			System.out.println(ret);
		}catch(ArithmeticException e){
			System.out.println("出异常啦！");
		}finally{
			System.out.println("关闭资源");
		}
		System.out.println("end.....");
		
	}

	private static void whyDemo() {
		// TODO Auto-generated method stub
		
	}

	private static boolean RegexDemo(String str) {
		// TODO Auto-generated method stub
		//判断一个字符串是否全部由数字组成
		char[] arr = str.toCharArray();
		
		return false;
		
	}

	private static void DateUtil() {
		// TODO Auto-generated method stub
		//格式化操作，把date类型--》String类型
		//解析操作：把String类型--->Date类型
		
		System.out.println(date2String(new Date(),"yyyy-MM-dd HH:mm:ss"));
		String2date();
	}

	private static void String2date() {
		// TODO Auto-generated method stub
		
	}

	private static String date2String(Date date,String pattern) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);
		
		
		return sdf.format(date);
		
	}

	private static void CalendarDemo() {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
	}
	
	

	private static int sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello myJava GitHub!");
		return 0;
	}

}
