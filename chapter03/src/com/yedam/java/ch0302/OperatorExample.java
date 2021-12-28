package com.yedam.java.ch0302;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부호연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte b = 100;
		int result3 = -b;
		System.out.println("result3 : " + result3);

		System.out.println();
		//증감연산자
		 
		int x = 10;
		int y = 10;
		int z;
		
		System.out.print("------------------------------");
		x++;
		++x;
		System.out.println("x= " + x);
		y--;
		--y;
		
		System.out.println("y= " + y);
		
		z=x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		z = ++x + y++;
		System.out.println("z= " + z); //  23
		System.out.println("x= " + z); // 15
		System.out.println("y= " + z); // 9
		
		x = 5;
		y = 5;
		
		
		System.out.println("--------------");
		z = x++ + --y;
		
		System.out.println("z= " + z); //  9
		System.out.println("x= " + x); // 6
		System.out.println("y= " + y); //4
		
		boolean play = true;
		play = !play;
		System.out.println(play);

		//산술연산자
		int int1 = 5;
		int int2 = 2;

		int result4 = int1 + int2;
		System.out.println("result4 : " + result4);
		
		double result5 = (double)int1/int2;
		System.out.println(result5);
		
		int result6 = int1 % int2;
		System.out.println(result6);
		
		//문자열 결합 연산자
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3+ 3.0 +"JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println();
		//비교연산자
		
		int num1 = 10;
		int num2 = 10;
		boolean bresult1 = (num1 == num2);
		boolean bresult2 = (num1 != num2);
		boolean bresult3 = (num1 <= num2);
		
		System.out.println("bresult1 : " + bresult1);
		System.out.println("bresult2 : " + bresult2);
		System.out.println("bresult3 : " + bresult3);
		
		char char1 = 'A';
		char char2 = 'B';
		
		boolean RESULT1 = ( '가' == 44031);
		System.out.println("RESULT1 : " + RESULT1);
		
		boolean bresult4 = (char1 == char2);
		System.out.println("bresult4 : " + bresult4);
		
		int v3 =1;
		double v4 = 1.0;
		System.out.println(v3==v4);
		
		double v5 = 0.1;
		float v6 = 0.1f;
		System.out.println(v5==v6);
		System.out.println((float)v5==v6);
		
		
		//논리연산자
		int charCode1 = 'A';
		
		//유니코드 중 65보다 크거나 같으면서 90보다 작거나 같으면 대문자
		if((charCode1 >= 65) & (charCode1 <=90)) {
			System.out.println("대문자\n");
		}
		if((charCode1 >= 97) && (charCode1 <= 122)) {
			System.out.println("소문자");
		
		}
		/*Scanner scanner = new Scanner(System.in);
		
		int numValue = Integer.parseInt(scanner.nextLine());
		if((numValue%2==0) || (numValue%3==0)) {
			System.out.println("2또는 3의 배수입니다.");
		
		
		//삼항 연산자
			int score = 95;
			char grade = (score>90) ? 'A' : 'B' ;
			System.out.printf("성적은 %d이고 등급은 %s입니다. \n", score, grade);
			
			int bbb = 5;
			bbb = -b;
			int result = 10/b;
			System.out.println(result);
			
			float var1 = 10f;
			float var2 = var1/100;
			if(var2 == 0.1f) {
				System.out.println("11");
			} else {
				System.out.println("22");
			}
			*/
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("첫 번째 수: " );
			double NUM = Double.parseDouble(scanner.nextLine());
			
			System.out.print("두 번째 수: " );
			double NUM2 = Double.parseDouble(scanner.nextLine());
			
			
			double result123 =  NUM / NUM2;
			System.out.println("----------------");
			if(NUM2==0 || NUM2 ==0.0) {
				System.out.print("결과:무한대");
			}	else {System.out.print("결과:" + result123);
		}
			
		//	int var1 = 10;
		//	int var2 = 3;
		//	int var3 = 14;
		//	double var4 = var1*var1*(var2 +(double)var3/100);
		//	System.out.println("원의 넓이:" + var4);
			

			
			
			System.out.print("아이디:");
			String name = scanner.nextLine();
			
			System.out.print("패스워드:");
			String strPassword = scanner.nextLine();
			int password = Integer.parseInt(strPassword);
				
			if(name.equals("java")) {
				if(password==12345) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패:패스워드가 틀림");
				}
					
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
				
			
			
			
			
			
			int A = 10;
			int B = 5;
			System.out.println( (A>7) && (B<=5));
			System.out.println( (A%3 == 2) || (B%2 != 1));
			
			int Q = 10;
			int W = 10;
			int result77;
			
			//1-1
			System.out.println(-Q);
			//1-2
			result77 = Q + W++;
			System.out.println(result77);
			System.out.println(W);
			//1-3
			
			
			result77 = Q + --W;
			System.out.println(result77);
		
			System.out.println("몫:" +Q/W +", "+ "나머지:" +Q%W);
			
		
			System.out.println("Good");
			}
			
	}		
			
	


