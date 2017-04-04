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
	 * @param message ��ʾ��ǰ�쳣��ԭ����Ϣ
	 * @param cause	��ǰ�쳣�ĸ���ԭ��
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

	//Java7֮ǰ�ֶ���Դ�ر�
	private static void test1() {
		// TODO Auto-generated method stub
		
	}
	
	//java7��ʼ�Զ���Դ�ر�
	private static void sigleCatchDemo() {
		// TODO Auto-generated method stub
		System.out.println("begin.....");
		try{
			int ret = 10/0;
			System.out.println(ret);
		}catch(ArithmeticException e){
			System.out.println("���쳣����");
		}finally{
			System.out.println("�ر���Դ");
		}
		System.out.println("end.....");
		
	}

	private static void whyDemo() {
		// TODO Auto-generated method stub
		
	}

	private static boolean RegexDemo(String str) {
		// TODO Auto-generated method stub
		//�ж�һ���ַ����Ƿ�ȫ�����������
		char[] arr = str.toCharArray();
		
		return false;
		
	}

	private static void DateUtil() {
		// TODO Auto-generated method stub
		//��ʽ����������date����--��String����
		//������������String����--->Date����
		
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
