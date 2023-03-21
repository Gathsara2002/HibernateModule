/**
 * @author : Gathsara
 * created : 3/20/2023 -- 3:05 PM
 **/

package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "owner")
public class Owner {
    @Id
    @Column(name = "owner_id")
    private String oId;
    @Column(name = "owner_name")
    private String name;
    @OneToMany(mappedBy = "owner")
    private List<Pet> list=new ArrayList<>();

    public Owner() {
    }

    public Owner(String oId, String name, List<Pet> list) {
        this.oId = oId;
        this.name = name;
        this.list = list;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getList() {
        return list;
    }

    public void setList(List<Pet> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
