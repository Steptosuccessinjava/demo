package com.newtouch.charactor;

import com.newtouch.property.Item;

public class Hero {
/*	public String name;
	
	public void kill(Mortal m){
		System.out.println(name + "释放了一个大招");
		m.die();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "盖伦";
		ADHero ad = new ADHero();
		ad.name = "艾希";
		APHero ap = new APHero();
		ap.name = "安妮";
		ADAPHero adap = new ADAPHero();
		adap.name = "提莫";
		hero.kill(ad);
		hero.kill(ap);
		hero.kill(adap);
	}*/
	
	String name;  //姓名
	float  hp;    //血量
	float armor;  //护甲
	int moveSpeed = 150;//移动速度
	
	public void useItem(Item i){
		System.out.println("Hero use Item");
		i.effect();
	}
	public Hero() {
		System.out.println("Hero的显式构造方法");
	}
	
	public Hero(String name){
		System.out.println("Hero的有一个参数的构造器");
		this.name = name;
	}
	public static void main(String[] args) {
		
		String sdf = "[123]";
		String sdf1 = sdf.replace("[", "").replace("]", "");
		String sdf2 = sdf1.replace("]", "");
		System.out.println(sdf1);
		
	}
	
}
