import java.util.*;
class Series1{
    void run(){
        System.out.println("enter the limit");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1, b=3, c=4,sum=0;
        for(int i=0;i<=n;i++){
            sum=a+b+c;
            System.out.println(sum);
            a=b;
            b=c;
            c=sum;
        }
    }
    public static void main(String args[])
    {
        Series1 obj=new Series1();
        obj.run();
    }
}