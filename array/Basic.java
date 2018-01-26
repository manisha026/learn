import java.util.*;
class Basic{
    void run(){
        int a[]=new int[2];
        System.out.println("enter the numbers");
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<2;i++){
             a[i]=s.nextInt();
           
        }
        // System.out.println(a.length);
        System.out.println("Here is your Values of array");
        for(int i=0; i<2; i++){
            System.out.println(a[i]);
        }    }
    public static void main(String args[]){
        Basic obj=new Basic();
        obj.run();
    }
}