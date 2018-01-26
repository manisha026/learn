import java.util.*;
class Series{
    void one(){
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1, a=0;
        int c=0;
        for(int i=0;i<=n;i++){
             c=a+temp;
            a=c;
            temp++;
            System.out.print(" " +c);
            System.out.print(" \n "+i);
        }
        
       }
public static void main(String args[]){
	Series obj=new Series();
	obj.one();
    }
	}