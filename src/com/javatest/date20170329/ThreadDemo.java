package com.javatest.date20170329;

import java.io.IOException;

public class ThreadDemo {
	public static void main(String[] args) {
/*		try {
			RuntimeDemo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		extendsDemo();
		
	}
	
	static class Person extends Thread{
		private int nums = 50;
		
		public Person(String name) {
			// TODO Auto-generated constructor stub
			super(name);
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < nums; i++) {
				if(nums > 0){					
					System.out.println(super.getName()+"���˱��Ϊ��"+ nums-- +"��ƻ��");
				}
			}
		}
	}

	private static void extendsDemo() {
		// TODO Auto-generated method stub
		//���������̣߳�ͬѧ������ƻ��
		
		
		new Person("СA").start();
		new Person("СB").start();
		new Person("СC").start();
		
		
	}

	private static void RuntimeDemo() throws IOException {
		// TODO Auto-generated method stub
		//��ʽһ
/*		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad");
		
		//��ʽ��
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();*/
		
		//ʹ�ýӿ���ʽ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ"+i);
			
			if (i==10) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for (int j = 0; j < 50; j++) {
							System.out.println("���ŵ�Ӱ"+j);
						}
					}
				}).start();
			}
		}
		
		//ʹ����ķ�ʽ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ"+i);
			
			if (i==10) {
				new Thread(){
					public void run() {
						for (int j = 0; j < 50; j++) {
							System.out.println("���ŵ�Ӱ"+j);
						}
					};
				}.start();
			}
			
		}
	}
	

}
