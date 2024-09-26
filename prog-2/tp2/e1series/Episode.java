package tp2.e1series;

public class Episode {

    private String title;
    private String description;
    private boolean isWatched;
    //if its empty, it must be negative.
    private Integer qualification = -1;

    public Episode(String title, String description) {
        this.title = title;
        this.description = description;
        setQualification(qualification);
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

    public boolean isWatched() {
        if (!isWatched){
            System.out.println("Haven't been seen");
        }
        System.out.println("The episode" + this.getTitle() + " was watched");
        return isWatched;
    }

    private void setWatched(boolean watched) {
        isWatched = watched;
    }

    public Integer getqualification() {

        System.out.println("The qualification is: " + qualification);
        return qualification;
    }

    public void setQualification(Integer qualification) {

        if (isValidqualification(qualification)){
            System.out.println("Qualification: " + qualification + " saved");
            this.setWatched(true);
            this.qualification = qualification;
        } else {
            System.out.println("Couldn't save the qualification.");
        }
    }

    private boolean isValidqualification(Integer value) {

        if (value < 1 || value > 5) {
            System.out.println("The value: " + value + ", is invalid, it must be between 1 and 5.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Episode{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isWatched=" + isWatched +
                ", qualification=" + qualification +
                '}';
    }
}
