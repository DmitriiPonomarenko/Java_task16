package vsu.ponomarenko.v16;

import javax.persistence.*;

@Entity
public class Invitations {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "events_id", referencedColumnName = "id")
    private Events events;

}
