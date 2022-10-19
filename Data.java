 import java.text.DecimalFormat;
public class Data
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args){
    //intansiasi objek Koperasi
    Koperasi Kop01 = new Koperasi();
    //mengisi data pada objeck Koperasi.
    Kop01.ID="K002";
    Kop01.nama="Fahly Ramdani";
    Kop01.alamat="Jl.Pemuda I";
    Kop01.pjm= 1900000;
    Kop01.angsrn = 200000;
 
    ///menganngi methodvoid()
    Kop01.cetakdata();
    Kop01.pjm();
    Kop01.angsrn();
    
    //Memanggil Methodnonvoid
    System.out.println("Sumbangan zakat : "+Kop01.hitungsumbangan());
    System.out.println("Cicilan Pertahun : "+Kop01.cicilanbulanan());
    System.out.println("Bunga : "+ df.format(Kop01.hitungbunga()));
 
}
}