package newsletters.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String Name;
    private String Email;


    public Subscriber() {
    }

    public Subscriber(String name, String email) {
        Name = name;
        Email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
