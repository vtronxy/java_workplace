package com.xy.test;

//在当前目录下，javac编译的时候 [向上检测] 是否存在com.xy.test
//执行的时候 java 向下寻找,执行需要完整的 包名限定  包名.类
public class Hello{
  public void sayHi(){
     System.out.println("hello world");
  }
}