import java.util.*;

public class Currency{
    public static float convertdollar(float amt){
        float amtdollar=amt/70;
        return amtdollar;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount");
        float amount=sc.nextFloat();
        System.out.println(convertdollar(amount));
        sc.close();
    }
}