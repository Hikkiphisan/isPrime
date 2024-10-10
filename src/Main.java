import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Nhap n");
            n = scanner.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("Khong hop le, nhap lai");
            }
        }
        if (laSoNguyenDuong(n)) {
            System.out.println("la so nguyen duong");
        } else {
            System.out.println("khong phai la so nguyen duong");
        };


    }

    private static boolean laSoNguyenDuong(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
         return true;
        }
    }
