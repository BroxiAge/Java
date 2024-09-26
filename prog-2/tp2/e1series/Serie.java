package tp2.e1series;

import java.util.*;
import java.util.stream.*;

public class Serie {

    private String title;
    private String description;
    private String author;
    private String genere;

    private List<Season> seasonList;

    public Serie(String title, String description, String author, String genere) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.genere = genere;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public List<Season> getSeasonList() {
        return seasonList;
    }

    public void setSeasonList(List<Season> seasonList) {
        this.seasonList = seasonList;
    }

    public Season getSeasonBySeasonNumber(int seasonNumber){

        return seasonList.stream()
                .filter(s -> s.getSeasonNumber() == seasonNumber)
                .findFirst()
                .orElse(null);
    }

    public long getWatchedEpisodesCount() {
        long episodesWatched = 0;

        for (Season s : seasonList) {
            episodesWatched = episodesWatched + s.getWatchedEpisodes();
        }

        return episodesWatched;
    }

    public double getAverageQualificationBySeasoNumber(int seasonNumber) {

        Season s = getSeasonBySeasonNumber(seasonNumber);
        System.out.println("La calificacion promedio de la serie: " + seasonNumber +" es: " + s.getCalificationAverage());
        return s.getCalificationAverage();
    }

    public double getOveralAverage() {

        double overalAverage = 0;

        for (Season s: seasonList) {
            overalAverage = overalAverage + s.getCalificationAverage();
        }

        return overalAverage;
    }
}
