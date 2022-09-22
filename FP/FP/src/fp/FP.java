package fp;
import javax.swing.JOptionPane;
public class FP {
    public static void main(String[] args) {
        String user,nama,idbarang;
        elektronik elk = new elektronik();
        elektronik[] data1 = new elektronik[100];
        mesincuci[] data2 = new mesincuci[100];
        kulkas[] data3 = new kulkas[100];
        ac[] data4 = new ac[100];
        tv[] data5 = new tv[100];
        int data0=0, beli=0;
        int pin,stock = 0;
        int a=0,
            b=0,
            dt1=0,
            dt2=0,
            dt3=0,
            dt4=0,
            dt5=0;
        int x=1;
        int total_beli;
        JOptionPane.showMessageDialog(null,"Selamat Datang");
        while(a==0){
            int login = Integer.parseInt(JOptionPane.showInputDialog("masukkan pilihan \n"
                        + "1. Admin\n"
                        + "2. Pembeli\n"
                        + "0. X-it"));
            switch(login){
                case 1://admin
                    //x=0;
                    while(b==0){
                        user = JOptionPane.showInputDialog("Masukkan nama anda : ");
                        pin  = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pin anda"));
                        if (pin==888) {
                            JOptionPane.showMessageDialog(null,"Wellcom back "+user);
                            b=1;
                            x=0;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Maaf anda pin salah");
                        }
                        break;
                    }//while b
                    while(x==0){
                        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pilihan : \n"
                                + "1. Input Data\n"
                                + "2. Lihat Data\n"
                                + "3. Update Data\n"
                                + "4. Delete Data\n"
                                + "0. X-it"));
                        switch(pilihan){
                        case 1://create
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pilihan : \n"
                                + "1. Mesin Cuci\n"
                                + "2. Kulkas\n"
                                + "3. AC\n"
                                + "4. Televisi\n"));
                            switch(pilihan){
                                case 1:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                    idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                    int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang : "));
                                    stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                    int tabung = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Tabung : "));
                                    data2[dt2]= new mesincuci(nama,idbarang,harga,stock,tabung);
                                    if (dt2>0) {
                                        if (data2[dt2-1].nama.contains(nama)) {
                                            data2[dt2-1].stock = data2[dt2-1].stock + stock;
                                            dt2--;
                                        }
                                    }
                                    dt2++;
                                    data0++;
                                    break;
                                case 2:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                    idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                    harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang : "));
                                    stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                    int pintu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Pintu : "));
                                    data3[dt3]= new kulkas(nama,idbarang,harga,stock,pintu);
                                    if (dt3>0) {
                                        if (data3[dt3-1].nama.contains(nama)) {
                                            data3[dt3-1].stock = data3[dt3-1].stock + stock;
                                            dt3--;
                                        }
                                    }
                                    dt3++;
                                    data0++;
                                    break;
                                case 3:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                    idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                    harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang : "));
                                    stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                    String PK = JOptionPane.showInputDialog("Masukkan Besar PK  : ");
                                    data4[dt4]= new ac(nama,idbarang,harga,stock,PK);
                                    if (dt4>0) {
                                        if (data4[dt4-1].nama.contains(nama)) {
                                            data4[dt4-1].stock = data4[dt4-1].stock + stock;
                                            dt4--;
                                        }
                                    }
                                    dt4++;
                                    data0++;
                                    break;
                                case 4:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                    idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                    harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga Barang : "));
                                    stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                    String jenis = JOptionPane.showInputDialog("Masukkan Jenis (LED/LCD) : ");
                                    data5[dt5]= new tv(nama,idbarang,harga,stock,jenis);
                                    if (dt5>0) {
                                        if (data5[dt5-1].nama.contains(nama)) {
                                            data5[dt5-1].stock = data5[dt5-1].stock + stock;
                                            dt5--;
                                        }
                                    }
                                    dt5++;
                                    data0++;
                                    break;
                                }//switch pilihan
                            break;
                        case 2://read
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jenis yang akan dilihat : \n"
                                + "1. Mesin Cuci\n"
                                + "2. Kulkas\n"
                                + "3. Ac\n"
                                + "4. Televisi\n"
                                + "0. X-it"));
                            switch(pilihan){
                                case 1:
                                    for (int i = 0; i < dt2; i++) {
                                        data2[i].tampilkan();
                                    }
                                    if (dt2==0) {
                                        JOptionPane.showMessageDialog(null,"Data kosong");
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < dt3; i++) {
                                        data3[i].tampilkan();
                                    }
                                    if (dt3==0) {
                                        JOptionPane.showMessageDialog(null,"Data kosong");
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < dt4; i++) {
                                        data4[i].tampilkan();
                                    }
                                    if (dt4==0) {
                                        JOptionPane.showMessageDialog(null,"Data kosong");
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < dt5; i++) {
                                        data5[i].tampilkan();
                                    }
                                    if (dt5==0) {
                                        JOptionPane.showMessageDialog(null,"Data kosong");
                                    }
                                    break;
                            }
                            break;
                        case 3://update
                            
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jenis yang akan dirubah : \n"
                                + "1. Mesin Cuci\n"
                                + "2. Kulkas\n"
                                + "3. Ac\n"
                                + "4. Televisi\n"
                                + "0. X-it"));
                            switch(pilihan){
                                case 1:
                                    for (int i = 0; i < dt2; i++) {
                                        String update = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin Diganti : ");
                                        if(data2[i].nama.contains(update)){
                                            nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                            idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                            int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga : "));
                                            stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                            int tabung = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Tabung : "));
                                            data2[i].mesincuci(nama,idbarang,harga,stock,tabung);
                                            System.out.println("Sukses");
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < dt3; i++) {
                                        String update = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin Diganti : ");
                                        if(data3[i].nama.contains(update)){
                                            nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                            idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                            int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga : "));
                                            stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                            int pintu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Pintu : "));
                                            data3[i].kulkas(nama,idbarang,harga,stock,pintu);
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < dt2; i++) {
                                        String update = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin Diganti : ");
                                        if(data4[i].nama.contains(update)){
                                            nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                            idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                            int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga : "));
                                            stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                            String PK = JOptionPane.showInputDialog("Masukkan Jumlah Pintu : ");
                                            data4[i].ac(nama,idbarang,harga,stock,PK);
                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < dt2; i++) {
                                        String update = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin Diganti : ");
                                        if(data5[i].nama.contains(update)){
                                            nama = JOptionPane.showInputDialog("Masukkan Nama : ");
                                            idbarang = JOptionPane.showInputDialog("Masukkan ID Barang : ");
                                            int harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Harga : "));
                                            stock = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Stock : "));
                                            String jenis = JOptionPane.showInputDialog("Masukkan Jenis (LED/LCD) : ");
                                            data5[i].tv(nama, idbarang,harga, stock, jenis);
                                        }
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Pilih Yang Benar Dong....");
                                    break;
                            }
                            break;
                        case 4://delete
                            String hapus = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin Dihapus : ");
                            int pil = Integer.parseInt(JOptionPane.showInputDialog("masukkan data yang ingin dihapus : \n"
                                + "1. Mesin Cuci\n"
                                + "2. Kulkas\n"
                                + "3. Ac\n"
                                + "4. Televisi\n"
                                + "0. X-it"));
                            switch(pil){
                                case 1:
                                    for (int i = 0; i < dt2; i++) {
                                        if(data2[i].nama.contains(hapus)){
                                            data2[i]=data2[i+1];
                                            JOptionPane.showMessageDialog(null,"Sukses");
                                            dt2--;
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < dt3; i++) {
                                        if(data3[i].nama.contains(hapus)){
                                            data3[i]=data3[i+1];
                                            JOptionPane.showMessageDialog(null,"Sukses");
                                            dt3--;
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < dt4; i++) {
                                        if(data3[i].nama.contains(hapus)){
                                            data4[i]=data4[i+1];
                                            JOptionPane.showMessageDialog(null,"Sukses");
                                            dt4--;
                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < dt5; i++) {
                                        if(data3[i].nama.contains(hapus)){
                                            data5[i]=data5[i+1];
                                            JOptionPane.showMessageDialog(null,"Sukses");
                                            dt5--;
                                        }
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Kurang aqua bos???");
                                    break;
                            }
                            break;
                        case 0:
                            int jawab = JOptionPane.showOptionDialog(null,"ingin keluar??", "Keluar", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
                            if(jawab== JOptionPane.YES_OPTION){
                                x++;//keluar loop
                                b=0;
                            }//if
                            break;
                        }//switch pilihan
                        //break;
                    }//while x
                
                    break;
                case 2://pembeli
                    int item = Integer.parseInt(JOptionPane.showInputDialog("Masukkan data yang ingin dibeli \n"
                                + "1. Mesin Cuci\n"
                                + "2. Kulkas\n"
                                + "3. Ac\n"
                                + "4. Televisi\n"
                                + "0. X-it"));
                            switch(item){
                                case 1:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin anda beli : ");
                                    for (int i = 0; i < dt2; i++) {
                                            if (data2[i].nama.contains(nama)) {
                                                int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang : "));
                                                elk.menu();
                                                if (elk.beli==1) {
                                                    for (i = 0; i < dt2; i++) {
                                                        if(data2[i].nama.contains(nama)){
                                                            data2[i].stock = data2[i].stock - jumlah;
                                                            total_beli = data2[i].harga * jumlah;
                                                            data2[i].tampilkan();
                                                            JOptionPane.showMessageDialog(null,"Total yang harus dibayar : "+total_beli);
                                                            JOptionPane.showMessageDialog(null,"Sukses");
                                                        }
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Silahkan datang lagi lain kali");
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Data barang tidak tersedia");
                                            }
                                    }
                                    if (dt2==0) {
                                        JOptionPane.showMessageDialog(null, "Data belum dimasukkan");
                                    }

                                    break;
                                case 2:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin anda beli : ");
                                    for (int i = 0; i < dt3; i++) {
                                            if (data3[i].nama.contains(nama)) {
                                                int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang : "));
                                                elk.menu();
                                                if (elk.beli==1) {
                                                    for (i = 0; i < dt3 ;i++) {
                                                        if(data3[i].nama.contains(nama)){
                                                            data3[i].stock = data3[i].stock - jumlah;
                                                            total_beli = data3[i].harga * jumlah;
                                                            data3[i].tampilkan();
                                                            JOptionPane.showMessageDialog(null,"Total yang harus dibayar : "+total_beli);
                                                            JOptionPane.showMessageDialog(null, "Sukses");
                                                        }
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Silahkan datang lagi lain kali");
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Data barang tidak tersedia");
                                            }
                                    }
                                    if (dt3==0) {
                                        JOptionPane.showMessageDialog(null, "Data belum dimasukkan");
                                    }

                                    break;
                                case 3:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin anda beli : ");
                                    for (int i = 0; i < dt4; i++) {
                                            if (data4[i].nama.contains(nama)) {
                                                int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang : "));
                                                elk.menu();
                                                if (elk.beli==1) {
                                                    for (i = 0; i < dt4; i++) {
                                                        if(data4[i].nama.contains(nama)){
                                                            data4[i].stock = data4[i].stock - jumlah;
                                                            total_beli = data4[i].harga * jumlah;
                                                            data4[i].tampilkan();
                                                            JOptionPane.showMessageDialog(null,"Total yang harus dibayar : "+total_beli);
                                                            JOptionPane.showMessageDialog(null, "Sukses");
                                                        }
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Silahkan datang lagi lain kali");
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Data barang tidak tersedia");
                                            }
                                    }
                                    if (dt4==0) {
                                        JOptionPane.showMessageDialog(null, "Data belum dimasukkan");
                                    }

                                    break;
                                case 4:
                                    nama = JOptionPane.showInputDialog("Masukkan Nama Barang yang ingin anda beli : ");
                                    for (int i = 0; i < dt5; i++) {
                                            if (data5[i].nama.contains(nama)) {
                                                int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Barang : "));
                                                elk.menu();
                                                if (elk.beli==1) {
                                                    for (i = 0; i < dt5; i++) {
                                                        if(data5[i].nama.contains(nama)){
                                                            data5[i].stock = data5[i].stock - jumlah;
                                                            total_beli = data5[i].harga * jumlah;
                                                            data5[i].tampilkan();
                                                            JOptionPane.showMessageDialog(null,"Total yang harus dibayar : "+total_beli);
                                                            JOptionPane.showMessageDialog(null, "Sukses");
                                                        }
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Silahkan datang lagi lain kali");
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Data barang tidak tersedia");
                                            }
                                    }
                                    if (dt5==0) {
                                        JOptionPane.showMessageDialog(null, "Data belum dimasukkan");
                                    }
                                    break;
                                case 0:
                                    break;
                            }
                    
                    break;
                case 0:
                    int jawab = JOptionPane.showOptionDialog(null,"ingin keluar??", "Keluar", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
                    if(jawab== JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Program akan keluar");
                        System.exit(0);
                        }
                        //a=0;
                        //b=0;
                    
            }//switch login
        }//while a
    }//main
}//fp

