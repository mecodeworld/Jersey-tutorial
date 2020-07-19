package codeworld.tutorial.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author h.kanure
 *
 */
@Entity
@Table(name = "FILM")
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FILM_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RELEASE_YEAR")
    private Date releaseYear;

    @Column(name = "RATING")
    private String rating;

    @Column(name = "SPECIAL_FEATURES")
    private String features;

    public FilmEntity() {
        super();
    }

    public FilmEntity(Long id, String title, String description, Date releaseYear, String rating, String features) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.features = features;
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

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
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
        FilmEntity other = (FilmEntity) obj;
        return Objects.equals(id, other.id);
    }

}
