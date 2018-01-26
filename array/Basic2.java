import java.util.*;
class Basic2{
    void run(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array lenght ypu want : ");
        int elementByuser = s.nextInt();
        System.out.println("Enter the selement:");
        int a[]=new int[elementByuser];
        int v=a.length;
        for(int i=0;i<v;i++){
            a[i]=s.nextInt();
        }
        int new_Length=a.length;
        System.out.println("Here is your array:");
        for(int i=0;i<new_Length;i++){
            System.out.println("Your "+i+" index value is: "+a[i]);
        }

        System.out.println("Sum of array is here");
        int sum=0;

        for(int i=0; i<new_Length; i++){
            sum += a[i];
        }
        System.out.println("The sum of the array is: "+sum);


        System.out.println("Even no.in array:");
        for(int i = 0; i<new_Length;i++) {
         if (a[i]%2 == 0){
             System.out.println("Your even number is here:"+a[i]);
         }   
        }
        System.out.println("Your odd numbers are:");
        for(int i =0; i<new_Length;i++){
            if(a[i]%2 != 0){
                System.out.println("Your odd number is here:"+a[i]);
            }
        }
    }

    public static void main(String args[]){
        Basic2 obj=new Basic2();
        obj.run();
    }
}