package com.maeq.javalearning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class StandardInputOutput2 {

	public static void main(String[] args) throws IOException {
        String s;  
        // �����������Ķ����Ӽ������ж�������  
        InputStreamReader ir = new InputStreamReader(System.in);  
        BufferedReader in = new BufferedReader(ir);  
        System.out.println("Unixϵͳ: ctrl-d �� ctrl-c �˳�"  
                + "\nWindowsϵͳ: ctrl-z �˳�");  
        try {  
            // ��һ�����ݣ�����׼�������ʾ��  
            s = in.readLine();  
            // readLine()��������ʱ������I/O���󣬽��׳�IOException�쳣  
            while (s != null) {  
                System.out.println("Read: " + s);  
                s = in.readLine();  
            }  
            // �رջ����Ķ���  
            in.close();  
        } catch (IOException e) { // Catch any IO exceptions.  
            e.printStackTrace();  
        }  

        // BufferedReader ��һ���÷�  ���ļ���ȡ����
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\ming.txt")));
        String data = null;
        while((data = br.readLine())!=null)
        {
        	System.out.println(data);
        }
        
        // BufferedReader ��һ���÷�  �������ȡ����
        String str3 = StandardInputOutput2.getHtml("http://www.baidu.com");
        System.out.println(str3);
	}
	
	public static String getHtml(String url) throws IOException {
		String source ="";
		String line ="";
		URL _url = new URL(url);
		InputStream inStream = _url.openStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream,"UTF-8"));
		while((line = bufferedReader.readLine())!=null) {
		source += line;
		}
		return source;
	}

}
