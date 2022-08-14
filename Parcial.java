package Parcial;
import java.util.Scanner;
/**
 *
 * @author Monzòn
 */
public class Parcial {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Ingrese el número que quiere saber si es un número par postivivo");
        num=sc.nextInt();
        numero(num);
    }
    static void numero(int x){
        if (x>0 && x%2==0){
            System.out.println("El numero es par positivo");
        }
        else{
                System.out.println("El numero no es un par positivo");
        }
    }
}