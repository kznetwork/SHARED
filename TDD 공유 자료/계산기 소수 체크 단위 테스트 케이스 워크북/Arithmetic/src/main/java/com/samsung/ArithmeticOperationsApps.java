package com.samsung;

import java.util.Scanner;

public class ArithmeticOperationsApps {
    public static void main (String[] args)
    {
        ArithmeticOperations ao=new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);
        int num1=0, num2=0;
        int result = 0;
        String operator = null;


        //첫번째 정수값 입력부분
        System.out.print("첫번째 정수값 >>");
        num1 = scan.nextInt();

        //연산자 입력부분
        System.out.print("연산자 >>");
        operator = scan.next();

        //두번째 정수값 입력부분
        System.out.print("두번째 정수 값 >>");
        num2 = scan.nextInt();

        //계산할 식
        System.out.println("================================================");
        System.out.println(num1+" "+operator+" "+num2+"을 계산합니다.");
        System.out.println("================================================");


        if(operator.equals("+"))
        {
            result = ao.addition(num1, num2);
            System.out.println(num1 + "+" + num2 + "=" + result+"입니다.");
        }
        else if(operator.equals("-"))
        {
            result = ao.subtraction(num1, num2);
            System.out.println(num1+"-"+num2+"="+result+"입니다.");

        }
        else if(operator.equals("*"))
        {
            result = ao.multiplication(num1, num2);
            System.out.println(num1+"*"+num2+"="+result+"입니다.");
        }
        else if(operator.equals("/"))
        {
            System.out.println("연산의 결과는"+num1+"/"+num2+"="+(float)ao.division(num1, num2)+"입니다.");
        }
        else
        {
            System.out.println("정확하게 정수와 연산자를 입력해주세요.");
        }
    }

}

