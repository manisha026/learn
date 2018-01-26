import java.util.*;
class Series2{
    void run(){
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=2, b=15, i,dif=13,res;
        for(i=2;i<n;i++){
                res=b+(dif*i);
                a=b;
                b=res;
                System.out.println(res);
        }
    }
    public static void main(String args[]){
        Series2 obj=new Series2();
        obj.run();
    }
}