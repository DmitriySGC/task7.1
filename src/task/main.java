package task;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i<size; i++) {
            System.out.println("Введите значение элемента массива: ");
            ar[i]=in.nextInt();
        }
        int x = 2;
        int y = 5;
        int z = 7;
        for (int i = 0; i < size; i++){
            if (ar[i]==x | ar[i]==y | ar[i]==z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }





    }
}

