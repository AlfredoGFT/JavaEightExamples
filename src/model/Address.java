package model;

import java.util.Date;
import java.util.Objects;

public class Address extends GenericEntity {

    private String country;

    private String state;

    private String city;

    private String district;

    private String road;

    private String number;

    private String complement;

    /* Constructors */

    public Address(Long id, Date createDate, Date updateDate, boolean disabled, String country, String state,
                   String city, String district, String road, String number, String complement) {
        super(id, createDate, updateDate, disabled);
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.road = road;
        this.number = number;
        this.complement = complement;
    }

    public Address(String country, String state, String city, String district, String road, String number, String complement) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.road = road;
        this.number = number;
        this.complement = complement;
    }

    public Address() {
    }

    /* Getters and Setters */

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    /* Equals and HashCode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Address address = (Address) o;
        return country.equals(address.country) && state.equals(address.state) && city.equals(address.city)
                && district.equals(address.district) && road.equals(address.road) && number.equals(address.number)
                && Objects.equals(complement, address.complement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country, state, city, district, road, number, complement);
    }

    /* To String */

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", road='" + road + '\'' +
                ", number='" + number + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}
