/**
 * @author : Gathsara
 * created : 3/21/2023 -- 3:12 PM
 **/

package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "lecture")
public class Lecture {
    @Id
    @Column(name = "lecture_id")
    private String id;
    @Column(name = "lecture_name")
    private String name;
    @ManyToMany
    private List<Subject> list=new ArrayList<>();

    public Lecture() {
    }

    public Lecture(String id, String name, List<Subject> list) {
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

    public List<Subject> getList() {
        return list;
    }

    public void setList(List<Subject> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
