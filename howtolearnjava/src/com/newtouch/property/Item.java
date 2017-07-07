package com.newtouch.property;

public class Item {
	String name;
    int price;
    
    public void buy(){
    	System.out.println("购买");
    }
    public void effect(){
    	System.out.println("物品使用后,可以有效果");
    }
    
    public static void main(String[] args) {
/*		Item item = new Item();
		item.effect();
		LifePotion lP = new LifePotion();
		lP.effect();*/
    	//类多态的演示 
    	/*
    	 *多态:都是同一个类型
    	 *     调用同一个方法
    	 *     呈现出不同的状态
    	 *实现类的多态:需要如下条件
    	 *     1.父类(接口)引用指向子类的对象
    	 *     2.调用的方法有重写
    	 */
    	Item i1 = new LifePotion();
    	Item i2 = new MagicPotion();
    	System.out.println("i1 是Item类型,执行effect打印");
    	i1.effect();
    	System.out.println("i2 是Item类型,执行effect打印");
    	i2.effect();
	}
}
