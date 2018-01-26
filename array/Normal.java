import java.util.*;
class Normal{
    void getdata(){
        System.out.println("enter the size of array");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int ar[]=new int[a];
        System.out.println("enter your array elements: ");
        for(int i=0;i<a;i++){
            ar[i]=s.nextInt();
        }
        System.out.println(  );
        for(int i=0;i<a;i++){
            System.out.print("  "+ar[i]+"  ");
        }
    }
    public static void main(String args[]) {
        Normal d=new Normal();
        d.getdata();
    }
}