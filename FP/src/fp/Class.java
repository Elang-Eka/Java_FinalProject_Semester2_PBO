package fp;
import javax.swing.JOptionPane;
abstract class toko{
    public abstract void menu();
}
class elektronik extends toko {
    public String nama;
    public String idbarang;
    public int stock;
    int harga;
    int beli;
    
    public elektronik(){
    }
    public elektronik(String nama, String idbarang,int harga ,int stock){
        this.nama = nama;
        this.idbarang = idbarang;
        this.harga = harga;
        this.stock= stock;
    }
    @Override
    public void menu() {
        int jawab = JOptionPane.showOptionDialog(null,"Apakah anda yakin??", "Confirmasi", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
                    if(jawab== JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Transaksi akan diproses");
                        beli = 1;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Apakah anda tidak punya uang?? :)");
                    }
    }
}
class mesincuci extends elektronik{
    public int tabung;
    
    public mesincuci(String nama,String idbarang,int harga,int stock, int tabung){
        super(nama,idbarang,harga,stock);
        this.tabung = tabung;
    }
    public void mesincuci(String nama,String idbarang,int harga,int stock, int tabung){
        this.nama = nama;
        this.idbarang = idbarang;
        this.harga = harga;
        this.stock= stock;
        this.tabung = tabung;
    }
    public void tampilkan(){
        JOptionPane.showMessageDialog(null,
                "Nama           : "+nama+"\n"
               +"ID Barang      : "+idbarang+"\n"
               +"Harga Barang   : "+harga+"\n"
               +"Stock          : "+stock+"\n"
               +"Tabung         : "+tabung);
    }
}
class kulkas extends elektronik{
    public int pintu;
    public kulkas (String nama, String idbarang,int harga, int stock, int pintu){
        super(nama,idbarang,harga,stock);
        this.pintu = pintu;
    }
    public void kulkas (String nama, String idbarang,int harga, int stock, int pintu){
        this.nama = nama;
        this.idbarang = idbarang;
        this.harga = harga;
        this.stock= stock;
        this.pintu = pintu;
    }
    public void tampilkan(){
        JOptionPane.showMessageDialog(null,
                "Nama           : "+nama+"\n"
               +"ID Barang      : "+idbarang+"\n"
               +"Harga Barang   : "+harga+"\n"
               +"Stock          : "+stock+"\n"
               +"Jumlah Pintu   : "+pintu);
    }
}
class ac extends elektronik{
    public String PK;
    public ac (String nama, String idbarang,int harga, int stock, String PK){
        super(nama,idbarang,harga,stock);
        this.PK = PK;
    }
    public void ac (String nama, String idbarang,int harga, int stock, String PK){
        this.nama = nama;
        this.idbarang = idbarang;
        this.harga = harga;
        this.stock= stock;
        this.PK = PK;
    }
    public void tampilkan(){
        JOptionPane.showMessageDialog(null,
                "Nama           : "+nama+"\n"
               +"ID Barang      : "+idbarang+"\n"
               +"Harga Barang   : "+harga+"\n"
               +"Stock          : "+stock+"\n"
               +"Besar PK       : "+PK);
    }
}
class tv extends elektronik{
    public String jenis;
    public tv (String nama, String idbarang,int harga,int stock,String jenis){
        super(nama,idbarang,harga,stock);
        this.jenis=jenis;
    }
    public void tv (String nama, String idbarang,int harga,int stock,String jenis){
        this.nama = nama;
        this.idbarang = idbarang;
        this.harga = harga;
        this.stock= stock;
        this.jenis=jenis;
    }
    public void tampilkan(){
        JOptionPane.showMessageDialog(null,
                "Nama           : "+nama+"\n"
               +"ID Barang      : "+idbarang+"\n"
               +"Harga Barang   : "+harga+"\n"
               +"Stock          : "+stock+"\n"
               +"Jenis TV       : "+jenis);
    }
}

