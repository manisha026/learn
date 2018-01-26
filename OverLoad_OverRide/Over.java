import java.util.*;
class Over{
   static public void add(int a, int b){
        System.out.println("addition of two parameter " + (a+b));
    }
    static public void add(int a, int b, int c){
        System.out.println("addition of 3 parameters " + (a+b+c));
    }
    public static void main(String args[]){
        Over obj=new Over();
        obj.add(2,5);
        obj.add(3,6,8);
    }
}