public class Koperasi
{
    String ID, nama, alamat;
    double pjm,angsrn;
 
 
 //Methodvoid
    void cetakdata(){
        System.out.println("==Data Nasabah==");
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("==Keuangan==");
    }
    
    void pjm(){
        System.out.println("Pinjaman : "+pjm);
    }
    
    void angsrn(){
        System.out.println("Angsuran : "+angsrn);
    }
    
    
 //Methodnonvoid
    double hitungsumbangan(){
    double sumbangan = pjm * 0.025;
    return sumbangan;
    
}
double cicilanbulanan(){
    double cicilan = angsrn * 12;
    return cicilan;
    
}
double hitungbunga(){
    double bunga = (cicilanbulanan()-pjm)/pjm*1;
    return bunga;
    
}

}