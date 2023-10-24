package com.example.teguh;

import java.util.ArrayList;

public class DataAnggota {

   private static String[] namaAnggota = {
        "Muhammad Teguh Prananto",
        "Karunia Agustiani",
        "Muhammad Hykal Nurhakim",
        "Affandra Fahrezi",
        "Mustofa Dzikry Pamungkas"
    };

   private static String[] detailAnggota ={
           "Saya Teguh, saya lahir di Depok pada 22 Desember 2002. Saya anak ke-4 dari 5 bersaudara. Saya tinggal di" +
                   " Komplek Asuransi Jasindo Blok B5 No.4. Hobi saya bermain komputer, dan cita-cita saya yaitu menjadi " +
                   "Data Scientist",
                   "Lahir depok, 17 agustus 2003\n" +
                   "anak ke 2 dari 2 bersaudara\n" +
                   "alamat di depok jawa barat\n" +
                   "hobby melukis\n" +
                   "cita-cita jadi orang baik",
           "saya muhammad hykal nurhakim. saya lahir di kota bogor tanggal 17 juni 2023. saya merupakan anak pertama dari 2 bersaudara. saat ini saya tinggal di kota bogor. Hobi saya makan dan tidur, serta memiliki cita cita menjadi wakil presiden",
            "Nama saya Affandra Fahrezi, lahir di Bogor pada 25 Maret 2003. Saya anak kedua dari dua bersaudara dan tinggal di Bogor. Hobi saya bermain game serta bercita-cita menjadi orang sukses dunia dan akhirat.",
           "Nama saya Musthofa Dzikry Pamungkas. saya lahir di kota Tangerang pada 30 November 2003. saya adalah anak ke empat dari empat bersaudara. saat ini saya tinggal di kos dekat kampus. hobi saya adalah bermain dota dan menghasilkan uang dan juga cita cita saya pengen beli truk"
   };

   private static int[] fotoAnggota ={
        R.drawable.gambarteguh,
           R.drawable.karun,
           R.drawable.hykal,
           R.drawable.affandra,
           R.drawable.jikroy
   };

   static ArrayList<Anggota> getListData(){
       ArrayList<Anggota> list = new ArrayList<>();
       for(int i=0; i<namaAnggota.length; i++){
           Anggota baru = new Anggota();
           baru.setNama(namaAnggota[i]);
           baru.setDetail(detailAnggota[i]);
           baru.setPhoto(fotoAnggota[i]);
           list.add(baru);
       }
       return list;
   }
}
