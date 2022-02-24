package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Book extends GenericEntity {

    private String name;

    private Set<Genre> genres;

    private Integer volume;

    private List<Author> authors;

    /* Constructors */

    public Book(Long id, Date createDate, Date updateDate, boolean disabled, String name, Set<Genre> genres,
                Integer volume, List<Author> authors) {
        super(id, createDate, updateDate, disabled);
        this.name = name;
        this.genres = genres;
        this.volume = volume;
        this.authors = authors;
    }

    public Book(String name, Set<Genre> genres, Integer volume, List<Author> authors) {
        this.name = name;
        this.genres = genres;
        this.volume = volume;
        this.authors = authors;
    }

    public Book() {
    }

    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    /* Equals and HashCode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return name.equals(book.name) && genres.equals(book.genres) && volume.equals(book.volume)
                && authors.equals(book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, genres, volume, authors);
    }

    /* To String */

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genres=" + genres +
                ", volume=" + volume +
                ", authors=" + authors +
                '}';
    }
}
