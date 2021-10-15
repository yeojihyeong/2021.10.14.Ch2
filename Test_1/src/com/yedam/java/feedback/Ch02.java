package com.yedam.java.feedback;

public class Ch02 {

	public static void main(String[] args) {
		int a;
		int b;
		
		a = b = 10;
		System.out.println("a:" + a + ", b:"+b);
		int result = a + b; // 10 + 10
		System.out.println("result: "+ result);
		
		if(result >= 5) {
			int c = 100;
			result = a+b+c;
			System.out.println("a:" + a + ", b:"+b+ ", c:"+c);
			System.out.println("result: "+result);
		}
		//System.out.println("a:" + a + ", b:"+b+ ", c:"+c);
		//System.out.println("result: "+result);
		System.out.println("=========================================================================");
		byte byteValue1 = 127;
		//byte byteValue2 = 128;
		short shortValue1 = 128;
		short shortValue2 = 32767;
		int intValue1 = 32768;
		long longValue1 = 21475678978L;
		//long longValue2 = 21475678978;
		System.out.println(byteValue1);
		System.out.println(shortValue1);
		System.out.println(shortValue2);
		System.out.println(longValue1);
		System.out.println(intValue1);
		
		char charValue1 = 'A'; //65
		System.out.println("charValue1 : "+ charValue1);
		System.out.println("charValue1의 유니코드 값 : "+ (int)charValue1);
		
		
		//char charValue2 "A";
		String str1 = "ABAB";
		String str2 = "Yeo JiHyeong";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		
		float floatValue1 = 3.14F;
		double doubleValue1 = 3.14;
		float floatValue2 = 3.0123456789123456789F;
		double doubleValue2 = 3.0123456789123456789;
		
		System.out.println("floatValue1 :" + floatValue1);
		System.out.println("floatValue2 :" + floatValue2);
		System.out.println("doubleValue1 :" + doubleValue1);
		System.out.println("doubleValue2 :" + doubleValue2);
		
		boolean stop = true;
		stop = false;
		
		System.out.println("====================================================================");
		
		
		byte bValue = 100;
		int iValue = bValue;
		System.out.println("iValue :" + iValue);
		iValue = iValue + 200;
		//bValue = iValue; error
		
		double dValue = 198.87632;
		long lValue = (long)dValue;
		
		System.out.println("lValue : "+ lValue);
		
		
	}

}
