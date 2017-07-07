package com.newtouch.charactor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestString {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        
        String str = "2016/1/5 12:12:12";
          
            Date d = sdf.parse(str);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str,d.toString());
    }
}
