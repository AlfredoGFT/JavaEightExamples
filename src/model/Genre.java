package model;

import java.util.Date;
import java.util.Objects;

public class Genre extends GenericEntity {

    private String name;

    private String description;

    private String pg;

    /* Constructors */

    public Genre(Long id, Date createDate, Date updateDate, boolean disabled, String name, String description,
                 String pg) {
        super(id, createDate, updateDate, disabled);
        this.name = name;
        this.description = description;
        this.pg = pg;
    }

    public Genre(String name, String description, String pg) {
        this.name = name;
        this.description = description;
        this.pg = pg;
    }

    public Genre() {
    }

    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    /* Equals and HashCode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Genre genre = (Genre) o;
        return name.equals(genre.name) && Objects.equals(description, genre.description) && pg.equals(genre.pg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description, pg);
    }

    /* To String */

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pg='" + pg + '\'' +
                '}';
    }
}
