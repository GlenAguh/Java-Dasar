class mahasiswa  {
    String nama;
    String nim;

    mahasiswa (String inputNama, String inputNim ){
        this.nama = inputNama;
        this.nim = inputNim;
    }
    // Method tanpa return dan parameter
    void show (){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
    }
    // Method tanpa return dan dengan parameter
    void setNama (String nama){
        this.nama = nama;
    }
    

}

public class Method {
    public static void main(String[] args) {
        

        mahasiswa mahasiswa1 = new mahasiswa("Glen", "21024181");
        
        // Method
        mahasiswa1.show();
        mahasiswa1.setNama("Glenn");
        mahasiswa1.show();
        
    }
}
