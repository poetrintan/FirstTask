package com.example.taskone.data

import com.example.taskone.R
import com.example.taskone.model.Anime
import com.example.taskone.model.Manhwa
import com.example.taskone.model.Movie
import com.example.taskone.model.About

object FullData {
    val animes = listOf(
        Anime(
            Title = "Jujutsu Kaisen",
            Genre = "Action",
            Studio = "MAPPA",
            Photo = R.drawable.jjk
        ),
        Anime(
            Title = "Bungou Stray Dog",
            Genre = "Action",
            Studio = "BONES",
            Photo = R.drawable.bsd
        ),
        Anime(
            Title = "Moriarty the Patriot",
            Genre = "Mystery",
            Studio = "Production IG",
            Photo = R.drawable.moriarty
        ),
        Anime(
            Title = "Natsume Yuujinchou",
            Genre = "Fantasy",
            Studio = "Shuka",
            Photo = R.drawable.natsume
        ),
        Anime(
            Title = "Gekai Elise",
            Genre = "Romance",
            Studio = "Maho Film",
            Photo = R.drawable.elise
        ),
        Anime(
            Title = "A Terrified Teacher at Ghoul School",
            Genre = "Comedy",
            Studio = "Satelight",
            Photo = R.drawable.ghoul
        ),
        Anime(
            Title = "Saiki Kusuo",
            Genre = "Comedy",
            Studio = "J.C. Staff",
            Photo = R.drawable.saiki
        ),
        Anime(
            Title = "Oblivion Battery",
            Genre = "Sport",
            Studio = "MAPPA",
            Photo = R.drawable.battery
        ),
        Anime(
            Title = "Detective Conan",
            Genre = "Mystery",
            Studio = "TMS Entertainment",
            Photo = R.drawable.conan
        ),
        Anime(
            Title = "Fruits Basket",
            Genre = "Romance",
            Studio = "Deen",
            Photo = R.drawable.fb
        )
    )

    val manhwas = listOf(
        Manhwa(
            Title = "The Villainess Reverses the Hourglass",
            Genre = "Fantasy",
            Status = "Completed",
            Photo = R.drawable.hourglass
        ),
        Manhwa(
            Title = "The Youngest Princess",
            Genre = "Fantasy",
            Status = "Ongoing",
            Photo = R.drawable.youngest
        ),
        Manhwa(
            Title = "Side Characters Deserves Love Too",
            Genre = "Comedy",
            Status = "Completed",
            Photo = R.drawable.sidechara
        ),
        Manhwa(
            Title = "Angelic Lady",
            Genre = "Regression",
            Status = "Completed",
            Photo = R.drawable.angelic
        ),
        Manhwa(
            Title = "The Monster Duchess and Contract",
            Genre = "Time Loop",
            Status = "Completed",
            Photo = R.drawable.monster
        ),
        Manhwa(
            Title = "A Villainess for the Tyrant",
            Genre = "Isekai",
            Status = "Completed",
            Photo = R.drawable.thetyrant
        ),
        Manhwa(
            Title = "Father, I Don't This Marriage",
            Genre = "Time Loop",
            Status = "Completed",
            Photo = R.drawable.father
        ),
        Manhwa(
            Title = "My Husband Hides His Beauty",
            Genre = "Romance",
            Status = "Completed",
            Photo = R.drawable.hides
        ),
        Manhwa(
            Title = "Symbiothic Relationship Between Rabbit and Black Panther",
            Genre = "Romance",
            Status = "Ongoing",
            Photo = R.drawable.rabbit
        ),
        Manhwa(
            Title = "I Shall Become a Master",
            Genre = "Isekai",
            Status = "Ongoing",
            Photo = R.drawable.master
        )
    )

    val movies = listOf(
        Movie(
            Title = "Howl's Moving Castle",
            Genre = "Fantasy",
            Studio = "Studio Ghibli",
            Photo = R.drawable.howl
        ),
        Movie(
            Title = "Mary and the Witch Flower",
            Genre = "Supranatural",
            Studio = "Studio Ghibli",
            Photo = R.drawable.mary
        ),
        Movie(
            Title = "Spirited Away",
            Genre = "Supranatural",
            Studio = "Studio Ghibli",
            Photo = R.drawable.spirited
        ),
        Movie(
            Title = "Ponyo",
            Genre = "Fantasy",
            Studio = "Toei Company",
            Photo = R.drawable.ponyo
        ),
        Movie(
            Title = "Suzume",
            Genre = "Fantasy",
            Studio = "CoMix Wave Films",
            Photo = R.drawable.suzume
        ),
        Movie(
            Title = "Princess Mononoke",
            Genre = "Adventure",
            Studio = "Studio Ghibli",
            Photo = R.drawable.mononoke
        ),
        Movie(
            Title = "My Neighbor Totoro",
            Genre = "Adventure",
            Studio = "Studio Ghibli",
            Photo = R.drawable.totoro
        ),
        Movie(
            Title = "Kiki's Delivery Service",
            Genre = "Adventure",
            Studio = "Studio Ghibli",
            Photo = R.drawable.kiki
        ),
        Movie(
            Title = "Your Name",
            Genre = "Romance",
            Studio = "Studio Ghibli",
            Photo = R.drawable.kimi
        ),
        Movie(
            Title = "Spy x Family Code White",
            Genre = "Comedy",
            Studio = "Wit Studio",
            Photo = R.drawable.spy
        )
    )

    val aboutData = listOf(
        About(
            Name = "Putri Andani Intan Permatasari",
            Email = "putriintan2602@gmail.com",
            University = "Universitas Pendidikan Indonesia",
            Major = "Pendidikan Guru Sekolah Dasar",
            Photo = R.drawable.putri
        )
    )
}