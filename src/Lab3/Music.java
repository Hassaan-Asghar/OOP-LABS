package Lab3;

public class Music {
    private String title;
    private Artist artist;
    private double duration;
    private String gener;
    private String albumName;
    private Date releaseDate;

    public Music(String title, Artist artist, double duration, String gener, String albumName, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.gener = gener;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String toString(){
        String print_details = String.format(" Title: %s\n %s\n Duration: %.2f\n Genre: %s\n Album Name: %s\n Release Date:\n %s",title,artist,duration,gener,albumName,releaseDate);
        return print_details;

    }

    public boolean equals(Object o) {
        if (o instanceof Music) {
            Music m = (Music) o;
            return m.getTitle().equals(this.title) && m.getArtist().getName().equals(this.getArtist().getName());
        }
        return false;
    }



}



