package com.example.examplemvvm.Model

class QuoteProvider {
    companion object {
        fun random():QuoteModel{
           val position = (0..5).random()
            return quote [position]
        }



        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "La cosa más difícil es conocernos a nosotros mismos la más fácil es hablar mal de los demás",
                author = "Tales de mileto"
            ),
            QuoteModel(
                quote = "No puedo enseñar nada a nadie. Solo puedo hacerles pensar",
                author = "Socrates"
            ),
            QuoteModel(
                quote = "No juzgamos a las personas que amamos",
                author = "Jean-paul Sartre"
            ),
            QuoteModel(
                quote = "El conocimiento es poder ",
                author = "Francis Bacon"
            ),
            QuoteModel(
                quote = "La peor lucha es la que no se hace",
                author = "Karl Marx"
            ),
            QuoteModel(
                quote = "No lastimes a los demas con lo que te causa dolor a ti mismo",
                author = "Buda"
            ),
        )
    }
}