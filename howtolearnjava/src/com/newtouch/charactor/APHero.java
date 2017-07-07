package com.newtouch.charactor;

public class APHero extends Hero implements AP,Mortal{

	@Override
	public void die() {
		System.out.println(name + "这个魔法攻击的英雄已经被击杀!");
	}

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		
	}

}
