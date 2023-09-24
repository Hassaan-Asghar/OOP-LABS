package Lab3;

public class Artist {
    private String name;
    private String nationality;
    private double rating;

    public Artist(String name, String nationality, double rating) {
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        String print_details = String.format("Artist Name: %s\n Nationality: %s\n Rating: %.2f",name,nationality,rating);
        return print_details;
    }
}
