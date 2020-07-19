package codeworld.tutorial.dto;

import java.util.Date;
import java.util.Objects;

public class Film {

    private Long id;
    private String title;
    private String description;
    private Date releaseDate;
    private String rating;
    private String features;
    private String language;

    public Film() {
        super();
    }

    public Film(Long id, String title, String description, Date releaseDate, String rating, String features, String language) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.features = features;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Film other = (Film) obj;
        return Objects.equals(id, other.id);
    }

}
