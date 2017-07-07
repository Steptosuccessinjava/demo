package com.newtouch.charactor;

import java.util.jar.Attributes.Name;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void die() {
		System.out.println(name+"这个混合伤害的英雄已经被击杀!");
	}

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		
	}

}
