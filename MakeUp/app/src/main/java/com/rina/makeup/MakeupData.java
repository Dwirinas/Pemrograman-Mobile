package com.rina.makeup;

import java.util.ArrayList;
import java.util.Collection;

public class MakeupData {
    public static String[][] data = new String[][] {
            {"0", "Bedak", "Bedak merupakan bubuk yang digunakan sebagai kosmetik untuk mempercantik muka atau sebagai obat kulit. Bedak membantu memberi rona pada wajah dan mempercantik penampilan.",
                    "https://i.postimg.cc/4NB6dc8m/bedak.jpg"},
            {"1","Blush On", "Blush On merupakan kosmetik yang umumnya digunakan oleh wanita untuk memerahkan pipi sehingga memberikan penampilan yang lebih muda dan untuk menegaskan bentuk tulang pipi.",
                    "https://i.postimg.cc/W43FHfjn/blush-on.jpg"},
            {"2","Concealer", "Concealeh adalah jenis perias wajah yang berfungsi untuk menyamarkan noda di wajah seperti bekas jerawat atau kantung mata. Perias ini banyak digunakan oleh kaum wanita.",
                    "https://i.postimg.cc/zf12wKr8/concealer.jpg"},
            {"3","Eyeliner", "Eyeliner merupakan kosmetik yang digunakan untuk mempercantik dan menegaskan bentuk mata, juga bisa mengoreksi bentuk mata yang terlalu sipit atau lebar.",
                    "https://i.postimg.cc/Gm0nNBCS/eyeliner.jpg"},
            {"4","Eyeshadow", "Eyeshadow merupakan kosmetik yang digunakan pada kelopak mata dan di bawah alis. Umumnya digunakan untuk membuat mata pemakai lebih menonjol atau agar terlihat lebih menarik.",
                    "https://i.postimg.cc/sXpMQBrB/eyeshawdow.jpg"},
            {"5","Fondation", "Foundation adalah riasan cair atau bedak yang diaplikasikan pada wajah untuk menciptakan warna yang merata dan merata pada kulit, menutupi kekurangan dan, kadang-kadang, untuk mengubah warna kulit alami.",
                    "https://i.postimg.cc/zXH9nTQP/foundation.jpg"},
            {"6","Lipstik", "Lipstik adalah kosmetik yang terbuat dari lilin, pigmen, minyak, dll. Lipstik biasa dimanfaatkan untuk memberikan warna pada bibir. Lipstik biasa digunakan oleh wanita.",
                    "https://i.postimg.cc/v8hW3KJ4/lipstik.jpg"},
            {"7","Maskara", "Maskara adalah kosmetik yang umumnya digunakan untuk memperindah mata. Fungsinya antara lain untuk mempergelap, mempertebal, memperpanjang, dan/atau memperjelas bulu mata.",
                    "https://i.postimg.cc/9fc9dtLd/mascara.jpg"},
            {"8","Pensil Alis", "Pensil Alis adalah produk makeup yang biasa digunakan untuk menata dan memberi warna pada alis. Berbentuk pensil dan memiliki berbagai warna yang mendekati warna alis alami. Brow pencil atau pensil alis cenderung memiliki goresan warna yang lembut dibanding produk alis lainnya.",
                    "https://i.postimg.cc/g0rgyWSq/pensil-alis.jpg"},
            {"9","Primer", "Primer kosmetik adalah krim atau lotion diterapkan sebelum kosmetik lain untuk meningkatkan cakupan dan memperpanjang jumlah waktu kosmetik berlangsung di wajah.",
                    "https://i.postimg.cc/cLzRS8hw/primer.jpg"},
            {"10","Highlighter", "Highlighter adalah jenis produk kosmetik yang memantulkan cahaya. Sering digunakan untuk berkontur, dapat diterapkan pada wajah atau bagian tubuh lain untuk mencerahkan kulit pada area tertentu, menciptakan persepsi kedalaman dan sudut.",
                    "https://i.postimg.cc/j5DzBPLn/highlighter.jpg"},
            {"11","Bronzer", "Bronzer adalah jenis produk kosmetik yang bermanfaat untuk memberikan efek hangat yang alami ketika wajah terpapar sinar matahari.",
                    "https://i.postimg.cc/Jn4L83Xx/bronzer.jpg"}
    };

    public static ArrayList<Makeup> getListData(){
        ArrayList<Makeup> list = new ArrayList<>();
        for (String[] aData: data){
            Makeup makeup = new Makeup();
            makeup.setId(Integer.parseInt(aData[0]));
            makeup.setName(aData[1]);
            makeup.setDescription(aData[2]);
            makeup.setPhoto(aData[3]);

            list.add(makeup);
        }
        return list;
    }
}
