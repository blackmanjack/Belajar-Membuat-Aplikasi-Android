package com.example.myapplication;

import java.util.ArrayList;

public class FpData {
    public static String[][] data = new String[][]{
            {"Lionel Messi",
                    "Bintang terbesar Barcelona dan Argentina ini menghasilkan gaji pokok sebesar US$646.000 per pekan musim lalu, dan itu sebelum mempertimbangkan kesepakatan yang menguntungkan dengan orang-orang dari Adidas dan Pepsi.",
                    "https://i.insider.com/5e7a1dd00c2a6225505f8ffd?width=800&format=jpeg&auto=webp",
                    "US$141,3 juta"},
            {"Cristiano Ronaldo",
                    "Dia mungkin berada di tahun-tahun terakhir karirnya, tetapi bintang Juventus Ronaldo masih menjadi salah satu bintang terbesar dalam sepakbola dunia. Selain dari sponsor tradisional, penghasilan Ronaldo datang dari berbagai sumber termasuk museum kehidupannya dan jaringan hotel.",
                    "https://i.insider.com/5e7a1dff0c2a6225c5521962?width=800&format=jpeg&auto=webp",
                    "US$127,3 juta"},
            {"Neymar",
                    "Neymar adalah pemain sepak bola paling mahal dalam sejarah, setelah pindah dari Barcelona ke PSG sebesar US$260 juta pada 2017. Dia memiliki sejumlah merek dagang sendiri, dan kesepakatan besar dengan Nike dan Beats.",
                    "https://i.insider.com/5e7a1e170c2a6225c728a3c8?width=800&format=jpeg&auto=webp",
                    "US$102,5 juta"},
            {"Gareth Bale",
                    "Pernah menjadi pemain termahal di dunia, pemain Wales ini tidak disukai Real Madrid, tetapi masih menghasilkan banyak uang di Spanyol, menambah gajinya dengan sponsor, dan posting Instagram yang masing-masing dapat menghasilkan US$185.000.",
                    "https://i.insider.com/5e7a1e49671de019ef1a7e69?width=800&format=jpeg&auto=webp",
                    "US$ 41 juta"},
            {"Antoine Griezmann",
                    "Bintang baru Barcelona setelah pindah dari Atletico Madrid ini memenangi Piala Dunia bersama Prancis, dan memiliki sponsor dengan perusahaan termasuk Puma, Gillette, Head & Shoulders, dan Huawei.",
                    "https://i.insider.com/5e7a1e75671de01a27116e15?width=800&format=jpeg&auto=webp",
                    "US$41 juta"},
            {"Eden Hazard",
                    "Transfer terbesar 2019, Belgian Hazard pindah dari Chelsea ke Real Madrid dengan biaya perkiraan US$157 juta, dengan paket pembayaran US$470.000 per minggu. Dia juga menghiasi sampul FIFA 20, permainan video sepakbola utama.",
                    "https://i.insider.com/5e7a1ea02d654f25493dfb25?width=800&format=jpeg&auto=webp",
                    "US$41 juta"},
            {"Andres Iniesta",
                    "Setelah 22 tahun berkarir di Spanyol di mana ia memenangkan Piala Dunia, 4 Liga Champions, dan 9 gelar La Liga, Iniesta pindah ke klub Jepang Vissel Kobe pada 2018, dan menjadi salah satu bintang bayaran sepakbola terbaik dunia yang mendominasi liga Jepang.",
                    "https://i.insider.com/5e7a1ebc0c2a62265f244f53?width=800&format=jpeg&auto=webp",
                    "US$36,7 juta"},
            {"Raheem Sterling",
                    "Sejak pindah ke Manchester City dari Liverpool pada 2015, Sterling telah menjadi properti terpanas di sepakbola Inggris. Dia menghasilkan sekitar US$350.000 per minggu, ditambah dengan banyak sponsor, termasuk satu dengan Nike.",
                    "https://i.insider.com/5e7a1f4b0c2a6226bb00a339?width=800&format=jpeg&auto=webp",
                    "US$35,6 juta"},
            {"Robert Lewandowski",
                    "Penyerang paling mematikan di Eropa yang mencetak 25 gol Bundesliga dan 11 gol hanya dalam 6 pertandingan Liga Champions sebelum musim sepak bola dihentikan wabah virus Corona. Striker Polandia ini menambah gajinya di Bayern Munich dengan sponsor yang menguntungkan dengan Nike.",
                    "https://i.insider.com/5e7a1f9b1378e36bd84dbc7d?width=800&format=jpeg&auto=webp",
                    "US$31,3 juta"},
            {"Kylian Mbappe",
                    "Kylian Mbappé Lottin (lahir 20 Desember 1998) adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.\n" +
                            "\n" +
                            "Mbappé sudah menonjol pada usia dini, ia menjadi bintang bagi akademi remaja di AS Bondy, INF Clairefontaine, dan Monaco, klub terakhir ini membuat debutnya sebagai seorang pemain profesional untuk tim cadangan. Mbappé segera menjadi starter reguler dan pencetak gol untuk tim pertama di musim 2016-17, membantu klub mendapatkan gelar pertama mereka di Ligue 1 di usia tujuh belas tahun. Musim berikutnya, ia bergabung dengan Paris Saint-Germain dengan kontrak pinjaman, dengan kesepakatan di tempat untuk dapat bergabung dengan klub secara permanen di akhir musim dengan biaya sekitar €180 juta.",
                    "https://i.insider.com/5e60c807a9f40c4f836f7b23?width=800&format=jpeg&auto=webp",
                    "US$29,1 juta"},
    };

    public static ArrayList<Fp> getListData() {
        Fp fp;
        ArrayList<Fp> list = new ArrayList<>();
        for (String[] myData : data) {
            fp = new Fp();
            fp.setName(myData[0]);
            fp.setDetail(myData[1]);
            fp.setPhoto(myData[2]);
            fp.setPrice(myData[3]);

            list.add(fp);
        }
        return list;
    }
}

