package com.newtouch.charactor;

/**
 * 什么是单例模式
 * 1.构造方法私有化
 * 2.静态属性指向实例
 * 3.public static 的getInstance方法,返回第二步的静态属性
 * @author Administrator
 *
 */

//饿汉式单例模式和懒汉式单例模式示例
public class GiantDragon {
	/*
	 * GiantDragon只有一只,通过私有化其构造方法,使得外部无法通过new得到新的实例
	 * GiantDragon提供一个public static的getInstace方法,外部调用者通过这个方法获取17行定义的对象,而且每次
	 * 获取的都是同一个对象.从而达到单例的目的.
	 * 这种单例模式又叫做饿汉式单例模式,无论如何都会创建一个实例
	
	//私有化构造方法使得该类无法在外部通过new进行实例化
	private GiantDragon(){
		
	}
	//准备一个类属性,指向一个实例化对象,因为是类属性,所以只有一个
	private static GiantDragon instance = new GiantDragon();
	
	//public static 方法,提供给调用者获取17行定义的对象
	public static GiantDragon getInstance(){
		return instance;
	}
	
    */
	
	/*
	 * 懒汉式单例 模式和饿汉式单例模式不一样,只有在调用者getInstance的时候才会创建实例
	 */
	//私有化构造方法使得该类无法在外部通过new进行实例化
	private GiantDragon(){
		
	}
	//准备一个类属性,用于指向一个实例化对象,但是暂时指向null
	private static GiantDragon instance;
	
	//public static 方法,返回实例对象
	public static   GiantDragon getInstance(){
		//第一次访问时,返回instance没有指向任何对象,这是实例化一个对象.
		if( null == instance ){
			instance = new GiantDragon();
		}
		//返回instance指向的对象
		return instance;
	}
	
	/**
	 * 什么时候使用这两种单例模式
	 * 1.饿汉式是立即加载的方式,无论是否会用到这个对象,都会加载.如果在构造方法中写了性能消耗较大的,
	 *   占用时间较久的代码,比如建立数据库的连接,那么在启动的时候会感觉稍微有些卡顿
	 * 2.懒汉式是延迟 加载的方式,只有在使用时才会加载,并且有线程安全的考量.
	 *   使用懒汉式,在启动的时候,会感觉比饿汉式略快,因为没有做对象的实例化.但是在第一次调用时,会进行实例化操作.感觉略慢
	 *   看具体的业务需求,如果业务允许有充分的启动和初始化时间,就使用饿汉式,否则使用懒汉式
	 */
}
