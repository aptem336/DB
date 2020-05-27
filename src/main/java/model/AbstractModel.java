package model;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractModel {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getId(), ((AbstractModel) o).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
