package com.newtouch.charactor;

import com.newtouch.property.Item;
import com.newtouch.property.LifePotion;

public class ADHero extends Hero implements AD,Mortal{

	int moveSpeed = 100;
	
	public ADHero(){
		System.out.println("ADHero的显式构造方法");
	}
    
	public ADHero(String name){
		super(name);
		System.out.println("ADHero的带一个参数的构造方法");
	}
	
	@Override
	public void die() {
		System.out.println(name + "这个物理攻击的英雄已经被击杀!");
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	
	public int getMoveSeed1(){
		return super.moveSpeed;
	}
	//重写useItem,并在其中调用父类的useItem方法
	public void useItem(Item i){
		System.out.println("ADHero use Item");
		super.useItem(i);
	}

	
	public static void main(String[] args) {
/*		new ADHero();
		new ADHero("德莱文");*/
	   ADHero ad = new ADHero();
	   ADHero adHero = new ADHero("德莱文");
/*	   System.out.println(ad.getMoveSpeed());
	   System.out.println(ad.getMoveSeed1());*/
	   
	}
}
