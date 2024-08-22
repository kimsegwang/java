package com.himedia.java;

//주석 : 컴파일러가 무시한다
//한줄주석
/*
범위주석
 */
//JVM은 자바를 실행하기 위한 가상 기계라고 할 수 있다.
//자바로 작성된 어플리케이션은 모두 이 가상 컴퓨터에서만 실행되기 때문에
//자바 어플리케이션이 실행되기 위해서는 반드시 JVM이 필요하다.
//요즘에는 바이트코드(컴파일된 자바코드)를 하드웨어의 기계어로 바로 변환해주는 JIT컴파일러와
//향상된 최적화 기술이 적용되어서 속도의 격차를 많이 줄였다.
//Java 어플리케이션은 JVM하고만 상호작용을 하기 때문에 OS와 하드웨어에 독립적이라
//다른 OS에서도 프로그램의 변경없이 실행이 가능하다.
//단, JVM은 OS에 종속적이기 때문에 해당 OS에서 실행가능한 JVM이 필요하다.

public class A_hellowold {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
