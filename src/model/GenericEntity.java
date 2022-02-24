package model;

import java.util.Date;
import java.util.Objects;

public class GenericEntity {

    private Long id;

    private Date createDate;

    private Date updateDate;

    private boolean disabled;

    /* Constructors */

    public GenericEntity(Long id, Date createDate, Date updateDate, boolean disabled) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.disabled = disabled;
    }

    public GenericEntity() {
    }

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    /* Equals and HashCode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericEntity that = (GenericEntity) o;
        return disabled == that.disabled && id.equals(that.id) && createDate.equals(that.createDate)
                && Objects.equals(updateDate, that.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, updateDate, disabled);
    }

    /* To String */

    @Override
    public String toString() {
        return "GenericEntity{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", disabled=" + disabled +
                '}';
    }
}
