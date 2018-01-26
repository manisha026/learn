import java.util.*;
class Natural{
    void sum(){
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(" + "+ i);
            sum +=i;
        }
        System.out.println("\n total sum of values are: "  +  sum);}
public static void main(String args[]){
	Natural obj=new Natural();
	obj.sum();}
	}