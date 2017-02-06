package javaapplication1;
import java.util.Scanner;
import java.lang.StringBuffer;
public class JavaApplication1 {
    public static int convert(String a)
    {
        String a1;
        char a2[];
        int n=0;
        a2=a.toCharArray();
        a1=a.replace(".", "");
        n=Integer.parseInt(a1);
        //System.out.print(n);
        if(a.length()==11 && a2[3]=='.' && a2[7]=='.' && a2[9]=='.'){
            return n;
        }
        System.out.println("Не корректный ввод");
        System.exit(0);
        return 0;
        
    }
    public static StringBuffer convert1(int a)
    {
        StringBuffer buf = new StringBuffer(String.valueOf(a));
        if(buf.length()==6)buf.insert(0, "00");
        if(buf.length()==7)buf.insert(0, "0");
        buf.insert(3, ".");
        buf.insert(7, ".");
        buf.insert(9, ".");
        return buf;
    }
    
    public static void main(String[] args) {
        String a,b;
        StringBuffer buf = new StringBuffer();
        int n1,n2;
        System.out.println("Введите диапазон адресов вида xxx.xxx.x.x или 3 для выхода:");
        Scanner scan = new Scanner(System.in);
        System.out.print("C:  ");
        a = scan.next();
        n1=convert(a);
        System.out.print("По: ");
        b = scan.next();
        n2=convert(b);
        if(n1>=n2){
            System.out.println("Не правильный диапазон!");
            System.exit(0);
        }
        System.out.println();
        for(int i= n1+1;i<n2;i++){
            buf=convert1(i);
            System.out.print(buf);
            System.out.println();
        }
    }
    
}
