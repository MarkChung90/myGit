package com.javatest.date20170329;

import java.io.IOException;

public class ThreadDemo {
	public static void main(String[] args) {
		try {
			RuntimeDemo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
