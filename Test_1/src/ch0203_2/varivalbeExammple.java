package ch0203_2;

public class varivalbeExammple {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		byte result = (byte)(byteValue1 + byteValue2); //(byte)가 없을경우 int + int로 취급
		int result1 = byteValue1 + byteValue2;
		
		char charValue1 = 'a';
		char charValue2 = 5;
		int charResult = charValue1 + charValue2;
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		
		System.out.println("byteResult: "+result);
		System.out.println("charResult, 유니코드 값: "+charResult);
		System.out.println("charResult, 출력문자: "+(char)charResult);
		System.out.println(intValue1+"/4: "+intValue2);
		double dValue1 = (double)intValue1/4; //intValue1/4.0 도 가능
		System.out.println(intValue1+"/4: "+dValue1); 
		
		
		
		
		System.out.println("================Quiz==================");
		byte x = 10;
		byte y = 20;
		int m = 30;
		long n = 70L;
		
		
		int result11= x+y+m;
		System.out.println(result11);
		
		long result21= x+y+n;
		System.out.println(result21);
		
		int x1 = 100;
		long y1 = 140L;
		float f1 = 3.14F;
		double d1 = 10.15;
		
		float result3 = x1+y1+f1;
		System.out.println(result3);
		
		double result4 = y1+f1+d1;
		System.out.println(result4);
		
		
		
		int value = 10+2+8;
		String str = 10 + 2 + "8"; // => "12"+"8" => 128
		String str1 = 10 + "2" + 8; // => "10" + "2" + "8" =>1028
		String str2 = "10" + 2 + 8; // => "10" + "2" + "8" =>1028
		String str3 = "10" + ( 2 + 8 ); // =>"10" + "10" =>1010
		
		System.out.println(value);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		int value1 = Integer.parseInt("10") + 2+ 8;
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		if(value3) {
				double result5 = value2 +1;
			System.out.println(result5);
			}
		System.out.println(value1);
		
		
		
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);
		
		String strResult = str5 + str7+ str6;
		System.out.println(strResult);
		System.out.println("================Quiz2==================");		
		
		
		
		int a1 = 10;
		int b1 = 2;
		double c1 = 4.75;
		double d1_1= b1+c1;
		
	
		String str09_1 = String.valueOf(a1);
		String str09_2 = String.valueOf(d1_1);
		
		String str9 = str09_1+"숫자결합"+(b1+c1);  
		String str10 = a1 + "숫자결합" + (b1+c1);		
		String str11 = a1 + "숫자결합" + str09_2;
		
		System.out.println(str9);
		System.out.println(str10);
		System.out.println(str11);
		
		
		
		}

}
