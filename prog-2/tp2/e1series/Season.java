package tp2.e1series;

import java.util.*;

public class Season {

    private int seasonNumber;
    private String title;
    private String description;
    private String author;
    private String genere;
    private List<Episode> episodesList;

    public Season(String title, String description, String author, String genere, List<Episode> episodesList, int seasonNumber) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.genere = genere;
        this.episodesList = episodesList;
        this.seasonNumber = seasonNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
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

    public List<Episode> getEpisodesList() {
        return episodesList;
    }

    public void setEpisodesList(List<Episode> episodesList) {
        this.episodesList = episodesList;
    }

    public long getWatchedEpisodes () {

        /* int episodeCount = 0;

        for (Episode episode : episodesList) {
            if (episode.isWatched()){
                episodeCount ++;
            }
        }

        System.out.println("Episodes watched: " + episodeCount);
        return episodeCount;*/

        return episodesList.stream()
                .filter(Episode::isWatched)
                .count();
    }

    public double getCalificationAverage() {
        return episodesList.stream()
                .filter(Episode::isWatched) // Filtra solo los episodios que han sido vistos
                .mapToDouble(Episode::getqualification) // Mapea cada episodio a su calificación
                .average() // Calcula el promedio de las calificaciones
                .orElse(0.0); // Retorna 0.0 si no hay episodios (evita Optional.empty)
    }

/*    public double getCalificationAverage() {
        if (episodesList.isEmpty()) {
            return 0.0; // Retorna 0.0 si la lista está vacía
        }

        double sum = 0.0;
        for (Episode episode : episodesList) {
            sum += episode.getCalification(); // Suma la calificación de cada episodio
        }

        return sum / episodesList.size(); // Calcula y retorna el promedio
    }*/


}
