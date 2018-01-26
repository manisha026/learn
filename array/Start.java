import java.util.*;
class Start{
    void run(){
                int sum=0, pos,x;
                Scanner s=new Scanner(System.in); 
                    System.out.println("in  " +i+ "  index "  + " value is " +a[i]);
                    sum=sum+a[i];
                System.out.println("sum of total element is "+sum);
                for(int i=0;i<n;i++){
                    if(a[i]%2==0){
                        System.out.println("even numbers are "+a[i]);
                    }
                }
                for(int i=0;i<n;i++){
                    if(a[i]%2!=0){
                        System.out.println("odd numbers are "+a[i]);
                    }
                }
                for(int i=0;i<n;i++){
                    System.out.println("enter the position where you want to insert the element ");
                    pos=s.nextInt();
                    System.out.println("enter the element which you want to insert:");
                    x=s.nextInt();
                    }
                }
    public static void main(String args[]){
        Start obj=new Start();
        obj.run();
    }
}