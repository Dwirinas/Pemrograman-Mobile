package com.rina.ormawapolines;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0", "HMJ Elektro", "Himpunan Mahasiswa Jurusan Teknik Elektro adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1", "HMJ Sipil", "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2", "HMJ Mesin", "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3", "Akuntansi", "Himpunan Mahasiswa Jurusan Akuntansi adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4", "Administrasi Bisnis", "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}

    };

    public static ArrayList<Hmj> getListData() {
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData: data) {
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}

