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
		
		
		
		
		
	}

}