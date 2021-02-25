package newsletters.demo.entity;

import javax.persistence.*;

@Entity
public class Subscriber {


    private Integer Id;
    private String Name;
    private String Email;


    public Subscriber() {
    }

    public Subscriber(String name, String email) {
        Name = name;
        Email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
