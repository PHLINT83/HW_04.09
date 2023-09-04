
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сдвиг: ");
        int num = scan.nextInt();
        int[]mass = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println("Исходный массив:");
        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        System.out.println("Смещаем влево:");
        for (int i = 0; i < num; i++){
            int first = mass[0];
            for(int j = 1; j < mass.length-1; j++){
                int temp = mass[j];
                mass[j - 1] = temp;
                mass[j] = mass[j + 1];
            }
            mass[mass.length-1] = first;
            for(int p = 0; p < mass.length; p++){
                System.out.print(mass[p] + " ");
            }
            System.out.println();
        }

        System.out.println("Смещаем вправо:");
        for (int i = 0; i < num; i++) {
            int last = mass[mass.length - 1];
            for (int j = mass.length - 1; j >= 1; j--) {
                int temp = mass[j];
                mass[j] = temp;
                mass[j] = mass[j - 1];
            }
            mass[0] = last;
            for (int p = 0; p < mass.length; p++) {
                System.out.print(mass[p] + " ");
            }
            System.out.println();
        }
    }
}