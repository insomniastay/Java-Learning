/**
 * 
 */
package com.maeq.javalearning;

/**
 * @author Administrator
 * ����Ϊnull  ���鳤��Ϊ0 �кβ�ͬ
 */
public class TestArrNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr1 = null;
		int [] arr2 = new int[0];
		
		System.out.println(arr1);	// null
		System.out.println(arr2);	// [I@1fe256b
		
		
		System.out.println(arr1.length);	// java.lang.NullPointerException
		System.out.println(arr2.length);	// 0
		
		// ע��˳�� �����淴
		// �����ж�Ϊ�� 
		if(arr1 == null || arr1.length == 0)
		{
			System.out.println("arr1 == null || arr1.length == 0");	// null
		}
		
	}

}
