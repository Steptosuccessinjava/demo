package com.newtouch.charactor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
public static void main(String[] args) throws ParseException {
	String abc = "123,12313,345345";
	String [] abcd = abc.split(",");
	for(int i= 0; i<abcd.length;i++){
		
	}
    String temp_str="";     
    Date dt = new Date();     
    //最后的aa表示“上午”或“下午”    HH表示24小时制    如果换成hh表示12小时制     
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");     
    temp_str=sdf.format(dt);
    
   // Date date = sdf.parse(temp_str); 
    System.out.println(dt);
}
}
