/**
 * @author : Gathsara
 * created : 3/20/2023 -- 10:51 AM
 **/

package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "laptop")
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    private String lid;
    @Column(name = "laptop_desc")
    private String description;
    @OneToOne
    private Student student;

    public Laptop() {
    }

    public Laptop(String lid, String description, Student student) {
        this.lid = lid;
        this.description = description;
        this.student = student;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid='" + lid + '\'' +
                ", description='" + description + '\'' +
                ", student=" + student +
                '}';
    }
}
