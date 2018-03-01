package info.exac.wicket_spring_hibernate.entity;

import javax.persistence.*;



/**
 * @author exac
 * @date 28/02/2018 22:17
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    @Column(name = "name", length = 100)
    private String name;




    // --- Generated getters / setters -------


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
}
