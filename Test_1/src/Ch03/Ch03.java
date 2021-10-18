package Ch03;

public class Ch03 {

	public static void main(String[] args) {

		
		/*
		  int a = -100;
		
		int result1 = +a;
		int result2 = -a;
		System.out.println("a :" +a);
		System.out.println("result1 :" +result1);
		System.out.println("result2 :" +result2);
		
		byte b = 100;
		int result3 = -b;
		System.out.println("result3 :" +result3);
				
		int x=10,y=10,z;
		System.out.println("==================================");
		x++;
		System.out.println("x의 값 : " +x++);
		++x;
		System.out.println("x의 값 : " +x);
		
		System.out.println("==================================");
		y--;
		System.out.println("y의 값 : " +y--);
		--y;
		System.out.println("y의 값 : " +y);
		
		System.out.println("==================================");
		z= x++;
		System.out.println("z의 값: "+z);
		System.out.println("x의 값: "+x);
		
		System.out.println("==================================");
		
		z= ++x;
		System.out.println("z의 값: "+z);
		System.out.println("x의 값: "+x);
		
		System.out.println("===========================================================================");
		z = ++x + y++; 
		System.out.println("z = " + z); // 16+7
		System.out.println("x = " + x); // 16
		System.out.println("y = " + y); // 8
		System.out.println("===========================================================================");
		
		x=y=5;
		
		z= x++ + --y;
		System.out.println("z = " + z); // 5+4 
		System.out.println("x = " + x); // 6
		System.out.println("y = " + y); // 4
		System.out.println("===========================================================================");
		z= --x + y++;
		System.out.println("z = " + z); // 5+4  
		System.out.println("x = " + x); // 5
		System.out.println("y = " + y); // 5
		System.out.println("===========================================================================");

		boolean play = true;
		System.out.println(" play : " + play);
		play = !play;
		System.out.println(" play : " + play);
		play = !play;
		System.out.println(" play : " + play);

		System.out.println("===========================================================================");
		int v1 = 5, v2= 2;
		
		int result4;
		
		result4 = v1+v2;
		System.out.println(result4);
		result4 = v1-v2;
		System.out.println(result4);
		result4 = v1*v2;
		System.out.println(result4);
		result4 = v1/v2;
		System.out.println(result4);
		result4 = v1%v2;
		System.out.println(result4);
		
		
		System.out.println("===========================================================================");
		double result5 = (double)v1/v2;
		System.out.println(result5);
		
		System.out.println("===========================================================================");
		
		char c1 = 'A' + 1;
		char c2 = 'B' + 2;
		int c3 = c1+c2;
		
		System.out.println(c1 +"+"+ c2 + "=" + c3); //유니코드값
		System.out.println("===========================================================================");
		
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		System.out.println("===========================================================================");
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("===========================================================================");
		
		int m, n ,total;
		m= n = 10;
		System.out.println(-m);
		System.out.println("===========================================================================");
		total = m+n++;
		System.out.println(total +" " + n);
		System.out.println("===========================================================================");
		total = m + --n;
		System.out.println(total);
		System.out.println("===========================================================================");
		m++;
		System.out.println(m);
		System.out.println("===========================================================================");
		total = m / n;
		System.out.println(total);
		
		total = m % n;
		System.out.println(total);
		System.out.println("===========================================================================");
		int val = 356;
		val = val -(val%100);
		System.out.println(val);
		System.out.printf("val =%d ",val);
*/
		
		int num1 = 10, num2 = 10;
		boolean bResult1 , bResult2, bResult3;
		bResult1 = (num1 == num2);
		bResult2 = (num1 != num2);
		bResult3 = (num1 <= num2);
		System.out.printf("num1 = num2 : %s\n",bResult1);
		System.out.printf("num1 != num2 : %s\n",bResult2);
		System.out.printf("num1 <= num2 : %s\n",bResult3);
		
		char char1 = 'A';		
		char char2 = 'a';
		boolean bResult4 = (char1 <= char2);
		System.out.printf("num1 > num2 : %s\n",bResult4);
		
		int v3 =1;
		double v4 = 1.0;
		System.out.printf("V3 == V4 : %s\n", v3==v4);
		
		double v5 = 0.1;
		Float v6 = 0.1F;
		System.out.printf("V5 == V6 : %s\n", v5==v6);
		System.out.printf("V5 == V6 : %s\n", (float)v5==v6);
		System.out.println("===========================================================================");
		
		int charCode = 'A';
		
		//유니코드 65보다 크거나 같으며 90보다는 같거나 작은 대문자
		
		if ((charCode >= 65) && (charCode<=90)) {
		System.out.println("대문자");	
		}
		
		
		if ((charCode >= 97) && (charCode<=122)) {
			System.out.println("소문자");	
			}
		
		if ((charCode >= 48) && (charCode<=57)) {
			System.out.println("0~9");	
			}

		int numValue = 6;
		if (numValue % 2 ==0 || numValue % 3 ==0) {
			System.out.println("2또는 3의 배수");	
			}
		System.out.println("===========================================================================");		
		int intResult = 0;
		intResult +=10;
		System.out.println(intResult);
		intResult -=5;
		System.out.println(intResult);
		intResult *=3;
		System.out.println(intResult);
		intResult /=5;
		System.out.println(intResult);
		intResult %=3;
		System.out.println(intResult);

		System.out.println("===========================================================================");		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.printf("등급 : %s\n", grade);
		System.out.println("===========================================================================");
		int age = 27;
		String str9 = (age > 19) ? "성인" : "미성년";
		System.out.printf("나이는 %d이고 %s 입니다. \n", age, str9);
		
		int value = 35;
		int valResult = (value %3 ==0) ? value%3 : value/3;
		System.out.println(valResult);
		
		
		a = a+10 // a+=10
	}

}