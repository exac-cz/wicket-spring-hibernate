package info.exac.wicket_spring_hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;



/**
 * @author exac
 * @date 28/02/2018 22:17
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    @Version
    @Column(name = "version")
    private Long version;


    @Column(name = "name", length = 100)
    private String name;




    // --- Generated getters / setters -------


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public Long getVersion() {
        return version;
    }



    public void setVersion(Long version) {
        this.version = version;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
}
