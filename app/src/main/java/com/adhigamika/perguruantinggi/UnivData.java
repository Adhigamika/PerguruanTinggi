package com.adhigamika.perguruantinggi;

import java.util.ArrayList;

public class UnivData {
    private static String [] univName = {
            "University Indonesia",
            "University Brawijaya",
            "University Udayana",
            "University Gadjah Mada",
            "University Telkom",
            "University Binus",
            "University Surabaya",
            "University Jember",
    };
    private static String [] univDetail = {
            "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, sementara kampus utama lainnya terdapat di Salemba, Jakarta Pusat. UI dianggap sebagai salah satu dari tiga perguruan tinggi papan atas di Indonesia.",
            "Universitas Brawijaya (UB) adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB. Nama Brawijaya diberikan khusus oleh Presiden Soekarno dengan harapan mampu gemilang seperti Raden Wijaya (Brawijaya I).",
            "Universitas Udayana (disingkat sebagai Unud) adalah perguruan tinggi negeri di yang berada di Jimbaran, Kabupaten Badung, Bali, Indonesia. Universitas Udayana berdiri pada tanggal 29 September 1962.\n" +
                    "\n" +
                    "Rektor Universitas Udayana pada tahun 2021- 2025 adalah Prof. Dr. Ir. I Nyoman Gde Antara, M.Eng, IPU.",
            "Universitas Gadjah Mada merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949 tentang Peraturan Tentang Penggabungan Perguruan Tinggi Menjadi Universiteit tanggal 16 Desember 1949.",
            "Universitas Telkom, atau Telkom University yang disingkat Tel-U, adalah sebuah perguruan tinggi swasta di Indonesia. Kampus utama Tel-U terletak di Kabupaten Bandung, Jawa Barat, tepatnya di Jalan Telekomunikasi - Terusan Buahbatu, di kawasan Bandung Technoplex (BT-Plex).",
            "Universitas Bina Nusantara pada awalnya berasal dari sebuah institusi pelatihan komputer Modern Computer Course yang didirikan pada 21 Oktober 1974.[1] Seiring dengan perkembangan, Modern Computer Course kemudian berkembang menjadi Akademi Teknik Komputer (ATK) pada 1 Juli 1981.",
            "Universitas Surabaya (UBAYA) adalah sebuah universitas di Surabaya, Jawa Timur. UBAYA merupakan penerus Universitas Trisakti Surabaya yang didirikan pada tahun 1966. Namanya diganti menjadi Universitas Surabaya pada 1968. Hari jadi UBAYA ditetapkan pada 11 Maret 1968. Universitas ini memiliki tiga kampus, kampus 1 berada di Ngagel, kampus 2 berada di Rungkut, dan kampus 3 berada di Trawas.",
            "Universitas Jember (disingkat sebagai Unej) adalah perguruan tinggi negeri yang terletak di Kabupaten Jember, Provinsi Jawa Timur. Pada awal berdiri tahun 1964, Universitas Negeri Djember yang disingkat Uned, memiliki lima fakultas, yakni Fakultas Hukum di Jember, dengan cabangnya di Banyuwangi, Fakultas Sosial dan Politik dan Fakultas Pertanian di Jember, Fakultas Ekonomi dan Fakultas Sastra di Banyuwangi.",
    };

    private static int[] univImage = {
            R.drawable.ui,
            R.drawable.ub,
            R.drawable.unud,
            R.drawable.ugm,
            R.drawable.telkom,
            R.drawable.binus,
            R.drawable.ubaya,
            R.drawable.jember,
    };

    static ArrayList<Univ> getListData(){
        ArrayList<Univ> list = new ArrayList<>();
        for (int position = 0; position <univName.length; position++){
            Univ univ = new Univ();
            univ.setName(univName[position]);
            univ.setDetail(univDetail[position]);
            univ.setPhoto(univImage[position]);
            list.add(univ);
        }
        return list;
    }
}
