import java.util.*;
class Basic1{
    void run(){
        int a[]=new int[];
        System.out.println("enter the size you want :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(a.length);
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println(a.length);

        
    }
}