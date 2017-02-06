/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
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
