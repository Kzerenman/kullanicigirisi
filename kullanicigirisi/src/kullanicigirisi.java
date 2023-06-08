import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("aginte") && password.equals(":-)")){
            System.out.print("Giriş Yaptınız : ");
        }else {
            System.out.print("Bilgileriniz Yanlış ! Yeniden Giriş Yapın yada Kaydolun ");
        }


    }
}

