/**
 * @author : Gathsara
 * created : 3/20/2023 -- 3:08 PM
 **/

package lk.ijse.hibernate.entity;

import javax.persistence.*;

@Entity
public class Pet {
    @Id
    @Column(name = "pet_id")
    private String pid;
    @Column(name = "pet_name")
    private String name;
    @ManyToOne
    private Owner owner;

    public Pet(String pid, String name, Owner owner) {
        this.pid = pid;
        this.name = name;
        this.owner = owner;
    }

    public Pet() {
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
