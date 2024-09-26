package tp2.e1series;

import java.util.List;

public class NetflixMain {

    public static void main(String[] args) {

        Episode e1 = new Episode("ep1", "es el ep 1");
        Episode e2 = new Episode("ep2", "es el ep 2");
        Episode e3 = new Episode("ep3", "es el ep 3");
        Episode e4 = new Episode("ep4", "es el ep 4");

        e1.setQualification(10);
        e2.setQualification(1);
        e3.setQualification(1);
        e4.setQualification(1);

        List<Episode> epS1List = List.of(e1, e2, e3, e4);
        Season s1 = new Season("The walking dead", "twd temporada 1","twd author", "twd genre", epS1List, 1);
        s1.setEpisodesList(epS1List);

/*        e1.setQualification(1);
        e2.setQualification(1);*/

        List<Episode> eps2List = List.of(e1, e2, e3, e4);
        Season s2 = new Season("The walking dead", "twd temporada 2","twd author", "twd genre", eps2List, 2);
        s2.setEpisodesList(eps2List);

        Serie twdSerie = new Serie("The walking dead", "Serie de zombies", "twd author", "twd genre");
        List<Season> seasonList = List.of(s1, s2);

        twdSerie.setSeasonList(seasonList);

        //Obtener el total episodios vistos de una temporada particular
        Season seasonChosen = twdSerie.getSeasonBySeasonNumber(1);
        System.out.println("Cantidad de episodios vistos: " + seasonChosen.getWatchedEpisodes());

        //Obtener el total de episodios vistos de una serie.
        System.out.println("Cantidad de episodios vistos: " + twdSerie.getWatchedEpisodesCount());

        // Obtener el promedio de las calificaciones dadas para una temporada particular.
        twdSerie.getAverageQualificationBySeasoNumber(1);

        //Obtener el promedio de las calificaciones dadas para una serie.
        twdSerie.getOveralAverage();

        //Determinar si se vio todos los episodios de la serie


    }
}