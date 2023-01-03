// membuat class sebagai template
class mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}



public class ClassObject {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "Glenn";
        mahasiswa1.nim = "21012181";
        mahasiswa1.jurusan = "Teknik Elektro";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.umur = 18;
        
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);

        System.out.println("");

        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "Indraa";
        mahasiswa2.nim = "21012184";
        mahasiswa2.jurusan = "Teknik Elektro";
        mahasiswa2.ipk = 5.0;
        mahasiswa2.umur = 20;
        
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);
    }
}
