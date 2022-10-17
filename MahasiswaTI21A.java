import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaTI21A extends Mahasiswa {

    public MahasiswaTI21A(String nim, String nama, int nilai) {
        super(nim, nama, nilai);
    }
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<MahasiswaTI21A> daftar = new ArrayList<>();
    System.out.print("Masukan Total Data : ");
    int n = Integer.parseInt(input.nextLine());
    int total_lulus = 0, total_tlulus = 0, nil_a = 0, nil_b = 0, nil_d = 0, total_nilai = 0;
    String nm_lulus = "", nm_tlulus = "", nm_a = "", nm_b = "", nm_d = "";
    for (int i = 0; i < n; i++) {
    System.out.println("_______________________________");   
    System.out.print("Masukan NIM :");
    String nim = input.nextLine();
    System.out.print("Masukan Nama : ");
    String nama = input.nextLine();
    System.out.print("Masukan Nilai :");
    int nilai = Integer.parseInt(input.nextLine());
    System.out.println("_______________________________");
    MahasiswaTI21A Angga = new MahasiswaTI21A(nim, nama, nilai);
            daftar.add(Angga);
            if (Angga.isLulus()) {
                total_lulus++;
                nm_lulus += nama + ", ";
            } else {
                total_tlulus++;
                nm_tlulus += nama + ", ";

            }
            if (Angga.getGradeTI21A() == 'A') {
                nil_a++;
                nm_a += nama + ", ";
            } else if (Angga.getGradeTI21A() == 'B') {
                nil_b++;
                nm_b += nama + ", ";
            } else if (Angga.getGradeTI21A() == 'D') {
                nil_d++;
                nm_d += nama + ", ";
            }
            total_nilai += nilai;
        }
        double rata = total_nilai / n;
        System.out.println("Hasil");
        for (int i = 0; i < n; i++) {
            daftar.get(i).info();
        }
        System.out.println("Jumlah Mahasiswa :" + n);
        if(total_lulus>0){
            System.out.println("Total Lulus :" + total_lulus + " Yaitu " + nm_lulus);
        }else{
            System.out.println("Total Lulus :" + total_lulus);
        }
        if(total_tlulus>0){
            System.out.println("Tidak Lulus :" + total_tlulus + " Yaitu " + nm_tlulus);
        }else{
            System.out.println("Tidak Lulus :" + total_tlulus);
        }
        if(nil_a>0){
            System.out.println("Nilai A :" + nil_a + " Yaitu " + nm_a);
        }else{
            System.out.println("Nilai A :" + nil_a);
        }
        if(nil_b>0){
            System.out.println("Nilai B :" + nil_b + " Yaitu " + nm_b);
        }else{
            System.out.println("Nilai B :" + nil_b);
        }
        if(nil_d>0){
              System.out.println("Nilai D :" + nil_d + " Yaitu " + nm_d);
        }else{
              System.out.println("Nilai D :" + nil_d);
        }
        System.out.println("Total Nilai :" + rata);
    }

}