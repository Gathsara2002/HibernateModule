/**
 * @author : Gathsara
 * created : 3/21/2023 -- 3:13 PM
 **/

package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "subject")
public class Subject {
    @Id
   @Column(name = "subject_id")
   private String id;
   @Column(name = "subject_name")
   private String name;
   @ManyToMany(mappedBy = "list")
   private List<Lecture> list=new ArrayList<>();


    public Subject() {
    }

    public Subject(String id, String name, List<Lecture> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lecture> getList() {
        return list;
    }

    public void setList(List<Lecture> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
