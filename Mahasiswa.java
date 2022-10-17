public class Mahasiswa {
    String nim;
    String nama;
    int nilai;
    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getNilai() {
        return nilai;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    public String getGrade() {
        switch (getGradeTI21A()) {
            case 'A':
                return "A (Lulus)";
            case 'B':
                return "B (Lulus)";
            case 'C':
                return "C (Lulus)";
            case 'D':
                return "D (Tidak Lulus)";
            case 'E':
                return "E (Tidak Lulus)";
            default:
                return "input Salah ";
        }
    }

    public boolean isLulus() {
        return getNilai() >= 60;
    }
    public char getGradeTI21A() {
        if (getNilai() >= 80 && getNilai() <= 100) {
            return 'A';
        } else if (getNilai() >= 70 && getNilai() <= 79) {
            return 'B';
        } else if (getNilai() >= 60 && getNilai() <= 69) {
            return 'C';
        } else if (getNilai() >= 50 && getNilai() <= 59) {
            return 'D';
        } else if (getNilai() >= 0 && getNilai() <= 49) {
            return 'E';
        }
        return ' ';
    }
    public void info() {
        System.out.println("------------------------------------------------");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + getGrade());
    }
}
