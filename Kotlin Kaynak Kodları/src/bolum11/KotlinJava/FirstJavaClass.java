package bolum11.KotlinJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstJavaClass {
    /*public void write(String text) {
        System.out.println("Java Çıktısı ---> Kotlinden alınan mesaj : " + text);
    }*/


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mesaj giriniz:");

        String message = null;

        try {
            message = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        new FirstKotlinClass().write(message);
    }
}
