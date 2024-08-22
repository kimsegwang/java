package com.himedia.p;

public class F_operator {

    public static void exam1(){
        int a =10;
        int b =4;

        System.out.printf("%d+%d=%d\n",a,b,a+b);
        System.out.printf("%d-%d=%d\n",a,b,a-b);
        System.out.printf("%d*%d=%d\n",a,b,a*b);
        System.out.printf("%d/%d=%f\n",a,b,a/(double)b);
        System.out.printf("%d%%%d=%d\n",a,b,a%b);
    }
    //단항연산자
    public static void exam2(){

        int i =5;
        System.out.println("==== 증감 ====");
        System.out.println("전위형 : "+ ++i);
        System.out.println("후위형 : "+ i++);
        System.out.println("결과 : "+ i);


        i =5;
        System.out.println("==== 감소 ====");
        System.out.println("전위형 : "+ --i);
        System.out.println("후위형 : "+ i--);
        System.out.println("결과 : "+ i);

        i=i+1;
        i-=1;
        i+=4;

    }


    public static void exam3(){
        System.out.printf("10==10.0f\t%b\n",10==10.0f);
        System.out.printf("'0'==0\t%b\n",'0'==0);
        System.out.printf("'A'==65\t%b\n",'A'==65);
        System.out.printf("'A'>65\t%b\n",'A'>65);
        System.out.printf("'A'>'B'\t%b\n",'A'>'B');

    }



    public static void exam4(){
        String str1 = new String("hello");
        String str2 = new String("hello");

        String str3 = "hello";
        String str4 = "hello";


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));



    }


    public static void exam5(){
        boolean a= true;
        boolean b= false;
        boolean c= true;

        System.out.println("a && b :"+(a&&b));
        System.out.println("a || b :"+(a||b));
        System.out.println("a && c :"+(a&&c));
        System.out.println("!a :"+!a);
    }



    public static void exam6(){

    }

    public static void main(String[] args) {
        exam5();
    }
}