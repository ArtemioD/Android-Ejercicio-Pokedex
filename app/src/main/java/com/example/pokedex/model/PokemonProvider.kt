package com.example.pokedex.model

class PokemonProvider {
    companion object {
        val pokemonList = mutableListOf<Pokemon>(
            Pokemon(1, "Bulbasaur", 80, 15,5, 25, Type.PLANTA, "https://ikincieltanoto.com/img//lists/52/pok-mon-12-things-you-didn-t-know-about-bulbasaur-3.jpg"),
            Pokemon(4, "Charmander", 60, 25,30, 30, Type.FUEGO, "https://archives.bulbagarden.net/media/upload/thumb/9/90/Leon_Charmander.png/250px-Leon_Charmander.png"),
            Pokemon(7, "Squirtle", 90, 32,23, 15, Type.AGUA, "https://i1.jugomobile.com/pt/images/2021/11/Pokemon-Brilliant-Diamond-e-Shining-Pearl-Onde-Encontrar-Squirtle.jpeg"),
            Pokemon(25, "Pikachu", 70, 37,11, 55, Type.ELECTRICO, "https://los40es00.epimg.net/los40/imagenes/2018/09/19/videojuegos/1537360830_157726_1537360880_noticia_normal.jpg"),

            Pokemon(37, "Vulpix", 60, 37,31, 65, Type.FUEGO, "https://www.creocommunity.dk/wp-content/uploads/2022/03/Kan-Vulpix-vaere-skinnende-i-Pokemon-GO.jpg"),
            Pokemon(43, "Oddish", 100, 12,15, 5, Type.PLANTA, "https://easycdn.es/1/imagenes/pokemon-escarlata-y-pokemon-purpura-nintendo-switch_345008.jpg"),
            Pokemon(54, "Psyduck", 65, 33,3, 30, Type.AGUA, "https://i.pinimg.com/originals/20/b0/27/20b027cbc6169621583ec64dc90e309b.jpg"),
            Pokemon(56, "Mankey", 90, 32,23, 85, Type.LUCHA, "https://images2.minutemediacdn.com/image/upload/c_crop,w_1024,h_576,x_0,y_0/c_fill,w_1440,ar_16:9,f_auto,q_auto,g_auto/images/voltaxMediaLibrary/mmsport/dbltap_en_international_web/01g5yhafzhberby5tfjs.png"),

            Pokemon(58, "Growlithe", 50, 28,17, 15, Type.FUEGO, "https://images.wikidexcdn.net/mwuploads/wikidex/thumb/7/70/latest/20200405195825/EP1109_Growlithe.png/1200px-EP1109_Growlithe.png"),
            Pokemon(26, "Raichu", 90, 49,30, 90, Type.ELECTRICO, "https://www.diariotiempo.com.ar/wp-content/uploads/2022/05/Algunos-fanaticos-de-Pokemon-quieren-que-Raichu-obtenga-un-beneficio.jpg"),
            Pokemon(57, "Primeape", 90, 32,23, 15, Type.LUCHA, "https://gcdn.lanetaneta.com/wp-content/uploads/2022/07/Pokemon-GO-Primeape-Raid-Guide-Mejores-contadores-y-debilidades.jpg"),
            Pokemon(60, "Poliwag", 100, 12,15, 5, Type.AGUA, "https://static0.srcdn.com/wordpress/wp-content/uploads/2020/07/Pokemon-Sword-and-Shield-Poliwag.jpg"),

            Pokemon(69, "Bellsprout", 88, 44,29, 7, Type.PLANTA, "https://alfabetajuega.com/hero/2019/11/Bellsprout.jpg?width=768&aspect_ratio=16:9&format=nowebp"),
            Pokemon(72, "Tentacool", 86, 26,42, 21, Type.AGUA, "https://w7.pngwing.com/pngs/650/93/png-transparent-tentacruel-pokemon-pokedex-tentacool-generazione-online-game-cartoon-fictional-character-online-game.png"),
            Pokemon(77, "Ponyta", 75, 37,18, 74, Type.FUEGO, "https://larepublica.pe/resizer/8so0I5lCce6RtgXvqJlcFOkqjX4=/1200x660/top/cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/ASWM4DYDHRFFJKL2DU6EVHKQSI.jpg"),
            Pokemon(81, "Magnemite", 70, 32,11, 55, Type.ELECTRICO, "https://www.nintenderos.com/wp-content/uploads/2021/02/Magnemite.png"),

            Pokemon(86, "Seel", 100, 65,45, 3, Type.AGUA, "https://img.pokemondb.net/artwork/large/seel.jpg"),
            Pokemon(101, "Electrode", 90, 12,83, 35, Type.ELECTRICO, "https://pm1.narvii.com/6750/1d973e818849ef1fc232f9e25b16f0f7bcfefc5dv2_hq.jpg"),
            Pokemon(106, "Hitmonlee", 70, 32,11, 55, Type.LUCHA, "https://i.pinimg.com/originals/e2/60/45/e26045a146349f2b8c1c60b022612c29.png"),
            Pokemon(98, "Krabby", 60, 25,30, 30, Type.AGUA, "https://64.media.tumblr.com/7120dd375dd06bc1044a962a59b83907/tumblr_nn9wd6DM3p1un95hzo1_r1_640.jpg"),

            Pokemon(114, "Tangela", 100, 12,15, 5, Type.PLANTA, "https://alfabetajuega.com/hero/2019/09/Tangela.jpg?width=1200&aspect_ratio=1200:631"),
            Pokemon(126, "Magmar", 70, 32,11, 55, Type.FUEGO, "https://www.hitc.com/static/uploads/2020/11/Pok%C3%A9mon-Go-What-time-does-the-Magmar-community-day-start-Magby-and-special-box-details.jpg"),
            Pokemon(145, "Zapdos", 86, 26,42, 21, Type.ELECTRICO, "https://alfabetajuega.com/hero/2021/04/Zapdos-en-Pok%C3%A9mon-GO.jpg?width=1200&aspect_ratio=1200:631"),
        )
    }
}