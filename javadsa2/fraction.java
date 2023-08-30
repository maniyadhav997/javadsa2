import java.io.*;
import java.util.*;
public class fraction {
    int num;
    int dem;
    public static fraction add(fraction f1,fraction f2){
        int numerator=f1.num*f2.dem+f1.dem*f2.num;
        int demonitor =f1.dem*f2.dem;
        fraction f3=new fraction(numerator,demonitor);
        return f3;

    }
    public static int gcd(int num,int dem){
        int min=Math.min(num,dem);
        for(int i=min;i>=1;i--){
            if(num%i==0&&dem%i==0) return i;
        }
        return min;
    }
    public fraction(int num, int dem) {
        this.num = num;
        this.dem = dem;
        simply();
    }
    public  void simply(){
        int hcf=gcd(num,dem);
        num/=hcf;
        dem/=hcf;
    }

    public static void main(String[] args) {
        fraction f1 = new fraction(35, 21);
        /*System.out.println(f1.num + "/" + f1.dem);  // Corrected the print statement
        //f1.simply();
         System.out.println(f1.num + "/" + f1.dem);*/
         System.out.println(f1.num + "/" + f1.dem);
          fraction f2 = new fraction(7, 3); 
          System.out.println(f2.num + "/" + f2.dem);
          fraction f3=add(f1,f2);
          System.out.println(f3.num + "/" + f3.dem);
    }
}
