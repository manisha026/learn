import java.util.*;
class Array1{
    void run(){
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]) {
        Array1 obj=new Array1();
        obj.run();
    }
}