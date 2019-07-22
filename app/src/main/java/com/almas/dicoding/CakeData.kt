package com.almas.dicoding

import java.util.ArrayList

object CakeData {
    private var data = arrayOf(
        arrayOf(
            "Lapis Legit - Indonesia",
            "Lapis legit terbuat dari tepung terigu, mentega, dan telur. Keunikan kue ini dapat dilihat dari bentuknya yang berlapis. Rasanya yang manis dan tekstur yang lembut, serta lapisannya yang bisa mencapai 18 sampai 22 layer membuatnya masuk dalam barisan kue favorit dunia.",
            "https://cdn.idntimes.com/content-images/post/20170801/4e9b7e59581871ed94ec59ba984308b8-7bf712b6bbd4e79e32e82ca599de1265.jpg"
        ),
        arrayOf(
            "Pavlova – New Zealand",
            "Nama Pavlova diambil dari salah satu ballerina terkenal asal Rusia, yaitu Anna Pavlova. Kue satu ini dibuat dengan putih telur dan gula. Kemudian, adonannya harus diaduk dengan lambat. Umumnya Pavlova disajikan topping buah-buahan di atasnya.",
            "https://cdn.idntimes.com/content-images/post/20170801/1371585544495-28f40ff790d535c2aa4b328e7c2e2619.jpeg"
        ),
        arrayOf(
            "Lamington – Australia",
            "Kue nasional asal Australia ini berbentuk seperti bolu lembut yang dilapisi cokelat dan taburan kelapa. Langmington memiliki berbagai varian isi. Salah satu yang favorit yakni isi raspberry. Salah satu toko yang menyajikan Lamington paling enak adalah Candied Bakery di Spotswood, Victoria.",
            "https://cdn.idntimes.com/content-images/post/20170801/lamington-cake-63168-1-a312364070375c25eab0694b7ff75430.jpeg"
        ),
        arrayOf(
            "Cheese cake – Amerika Serikat",
            "Sejak zaman Yunani kuno, masyarakatnya telah memakan keju manis, mirip dengan cheese cake ini. Cheese cake sekarang semakin tren. Sudah banyak kafe dessert yang pasti menyuguhkan cake satu ini.",
            "https://cdn.idntimes.com/content-images/post/20170801/white-chocolate-cheesecake-2178efe66efe064cc804dbffcb2bfe13.jpg"
        ),
        arrayOf(
            "Black forest – Jerman",
            "Di Jerman, kue black forest ini bernama asli Schwarzwalder Kirschtorte. Kue sponge coklat ini dilapisi krim dan buah cerry yang segar. Di Indonesia pasti sudah tak asing lagi dengan kue manis satu ini.",
            "https://cdn.idntimes.com/content-images/post/20170801/black-forest-cake-92535-1-2602e4df9d8252fd4c51a45df1fcf4cf.jpeg"
        ),
        arrayOf(
            "Tiramisu – Italia",
            "Tiramisu terbuat dari lapisan kue yang dicelupkan ke dalam kopi dan ditumpuk menggunakan keju mascarpone. Selain rasa yang original dengan rasa kopinya yang khas. Ada juga tiramisu dengan berbagai rasa seperti stroberi, pistachio, hingga matcha.",
            "https://cdn.idntimes.com/content-images/post/20170801/6332b191d17bebc8d0fb96a9c6ec05bf-113cd20a8d5ae1095490b35eeae32c3e.jpg"
        ),
        arrayOf(
            "Madeleines – Prancis",
            "Kue yang berbentuk cangkang kerang ini memang tidak sepopuler crepe, tetapi kue ini sangat enak dan bisa menjadi temanmu minum teh.",
            "https://cdn.idntimes.com/content-images/post/20170801/daniel-boulud-madeleines-5a948fbf3e51954fead12f7c9166e47d.jpg"
        ),
        arrayOf(
            "Pandan cake – Malaysia dan Singapura",
            "Rasanya yang manis dan khas aroma pandannya ini sangat terkenal di Malaysia, Singapura, dan Indonesia. Jadi tak heran jika banyak banget orang yang suka dengan kue pandan ini. Warnanya yang hijau juga menggambarkan hijaunya alam, membuat kita merasa sejuk saat mengonsumsinya.",
            "https://cdn.idntimes.com/content-images/post/20170801/malaysias-pandan-cake-listed-in-cnns-cakes-of-the-world-but-they-think-its-from-singapore-too-world-of-buzz-d037374db741555beb34a93163494ad9.jpg"
        ),
        arrayOf(
            "Tres leches – Meksiko",
            "Jika tiramisu direndam dengan kopi, kue asal Meksiko ini direndam dengan 3 susu sekaligus. Sddeperti susu kental manis, susu evaporasi, dan susu biasa. Kemudian di atasnya diberikan whipped cream dan irisan stroberi.",
            "https://cdn.idntimes.com/content-images/post/20170801/0707b703-6bfc-431d-8307-25e626ee4815-1737330015205dd059c34fd7f0769e5b.jpg"
        ),
        arrayOf(
            "Victoria sponge – Inggris",
            "Kue ini terdiri dari 2 kue sponge yang ditumpuk dengan menggunakan mentega.  Diberi selai raspberry,  whipped cream,  dan taburan bubuk gula membuatnya tampak semakin manis.",
            "https://cdn.idntimes.com/content-images/post/20170801/apemiwyqmpntzpjgsd6f-cda7e5b8a5ec365d2e5849f67c5c0c11.jpg"
        )
    )

    val listData: ArrayList<Cake>
        get() {
            val list = ArrayList<Cake>()
            for (aData in data){
                val cake = Cake()
                cake.name = aData[0]
                cake.detail = aData[1]
                cake.photo = aData[2]

                list.add(cake)
            }
            return list
        }
}