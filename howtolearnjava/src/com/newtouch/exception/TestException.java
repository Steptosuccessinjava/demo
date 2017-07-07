package com.newtouch.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常--导致程序的正常流程被中断的事件
 * 异常的处理:
 * 1.try catch(多异常捕捉,可以分别catch,也可以catch中有多个exception,if(e instanceof 具体的exception))
 *   将可能抛出异常的代码放在try中,如果没有异常,就会顺序往下执行,并且不会执行catch块中
 *   的代码.若是发生异常,try中的代码会立即停止,程序流程会运行到对应的catch块中,e.printStackTrace(); 会打印出方法的调用痕迹.
 * 2.throw
 * 	 主方法调用method1
 *	method1调用method2
 *	method2中打开文件
 *
 *	method2中需要进行异常处理
 *	但是method2不打算处理，而是把这个异常通过throws抛出去
 *	那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。
 *	method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
 * 3.throw 和throws的区别
 *   throws出现在方法声明上,而throw通常出现在方法体内
 *   throws表示出现异常的一种可能性,并不一定会发生这些异常;throw则是抛出异常,执行throw则一定会抛出某个异常.
 * 4.异常分为可查异常,运行时异常和错误3种
 *   4.1可查异常:CheckedException,即必须进行处理的异常,要么try catch住,要么往外抛,谁调用,谁处理.如果不处理,编译器就不让你通过.比如 FileNotFoundException
 *   4.2运行时异常:RuntimeException,不是不必须要进行try catch的异常,常见的运行时异常:除数不能为0的异常--ArithmeticException ,
 *   下标越界异常--ArrayIndexOutOfBoundsException ,空指针异常--NullPointerException等等.在编写代码时,依然可以使用try catch throws进行处理
 *   ,与可查异常的不同之处在于:即使不进行try catch,也不会有编译错误
 *   Java之所以会设计运行时异常的原因之一，是因为下标越界，空指针这些运行时异常太过于普遍，如果都需要进行捕捉，代码的可读性就会变得很糟糕。
 *   4.3错误Error，指的是系统级别的异常，通常是内存用光了
 *	  在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
 *	  如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
 *	  与运行时异常一样，错误也是不要求强制捕捉的 c
 * @author Chenjun
 *
 */
public class TestException {
	
	public static void main(String[] args) {
        File f= new File("d:/LOL.exe");
        
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        try {
			new FileInputStream(f);
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			t.printStackTrace();
		}
	}
}
