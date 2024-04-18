import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        String id, pass;
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        id = input.nextLine();
        System.out.print("Password: ");
        pass = input.nextLine();
        if ((id.equals("Berke")) && (pass.equals("b123"))){
            System.out.println("Giriş yapıldı.");
        } else {
            System.out.println("Şifreniz yanlış.");
            System.out.println("Sıfırlamak ister misiniz? (EVET = 1, HAYIR = 2");
            int ans = input.nextInt();
            if (ans == 1) {
                input.nextLine();
                System.out.print("Yeni şifrenizi giriniz: ");
                pass = input.nextLine();
                if (pass.equals("b123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.print("Yeni şifrenizi giriniz: ");
                    pass = input.nextLine();
                }
                System.out.print("Şifre oluşturuldu.");

            }
        }
    }
}
