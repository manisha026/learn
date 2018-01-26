import java.util.*;
class Square{
    void multi(){
        System.out.println("Enter the value :");
        Scanner sc=new Scanner(System.in);
        double s=sc.nextDouble();
        double r;
        {
        r=s*s;
        }System.out.println("square of value is: " +r);
        }
public static void main(String args[]){
	Square obj=new Square();
	obj.multi();}
	}