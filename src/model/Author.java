package model;

import java.util.Date;
import java.util.Objects;

public class Author extends GenericEntity {

    private String name;

    private String surname;

    private String nickname;

    private Date birthdate;

    private SexualIdentificationIndicator sexualIndication;

    private Address address;

    /* Constructors */

    public Author(Long id, Date createDate, Date updateDate, boolean disabled, String name, String surname,
                  String nickname, Date birthdate, SexualIdentificationIndicator sexualIndication, Address address) {
        super(id, createDate, updateDate, disabled);
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.birthdate = birthdate;
        this.sexualIndication = sexualIndication;
        this.address = address;
    }

    public Author(String name, String surname, String nickname, Date birthdate,
                  SexualIdentificationIndicator sexualIndication, Address address) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.birthdate = birthdate;
        this.sexualIndication = sexualIndication;
        this.address = address;
    }

    public Author() {
    }

    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public SexualIdentificationIndicator getSexualIndication() {
        return sexualIndication;
    }

    public void setSexualIndication(SexualIdentificationIndicator sexualIndication) {
        this.sexualIndication = sexualIndication;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* Equals and HashCode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname) && nickname.equals(author.nickname)
                && birthdate.equals(author.birthdate) && sexualIndication == author.sexualIndication
                && Objects.equals(address, author.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, nickname, birthdate, sexualIndication, address);
    }

    /* To String */

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthdate=" + birthdate +
                ", sexualIndication=" + sexualIndication +
                ", address=" + address +
                '}';
    }
}
