
package javaapplication2;
import  java.util.*;
import java.util.Scanner;
import java.lang.StringBuffer;
public class JavaApplication2 {

    public static void main(String[] args){
    HashMap<String, ArrayList<String>> pers = new HashMap<String, ArrayList<String>>();
    ArrayList<String> tel = new ArrayList<String>();
    ArrayList<String> tel2 = new ArrayList<String>();
    ArrayList<String> tel3 = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    String str;
    tel.add("+8 800 2000 500");
    tel.add("+8 800 200 600");
    tel2.add("+8 800 2000 700");
    tel3.add("+8 800 2000 800");
    tel3.add("+8 800 2000 900");
    tel3.add("+8 800 2000 000");
    pers.put("Ivanov I.I.", tel);
    pers.put("Petrov P.P.", tel2);
    pers.put("Sidorov S.S.", tel3);
    str = scan.nextLine();
    System.out.println(str);
    if(pers.containsKey(str)){
      System.out.println("Телефоны"+ pers.get(str));  
    }else{
        System.out.println("Нет такого Фио в базе");
    }
        
    }

}
