import java.util.Scanner;

public class RataNilai15 {
    public static void main(String[] args) {
       Scanner input15 = new Scanner(System.in);
       int i, j;
       float nilaiMhs, totalNilai, rataNilai;
       for (j=1;j<=5;i++) {
        i=1;
        while (i<=5){
            System.out.println("Input Nilai Mahasiswa ke-" + i);
            totalNilai=0;
        for (j=1;j<=5;j++) {
            System.out.print("Nilai ke-" + j + " = ");
            nilaiMhs=input15.nextInt();
            totalNilai+=nilaiMhs;
        }
        rataNilai=totalNilai/5;
        System.out.println("Rata-rata Nilai Mahasiswa Ke-" + i + " adalah " + rataNilai);
        i++;
        }
       }
    }
}