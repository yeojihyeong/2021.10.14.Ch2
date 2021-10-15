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
	}

}
