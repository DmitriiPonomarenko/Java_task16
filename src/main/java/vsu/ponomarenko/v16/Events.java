package vsu.ponomarenko.v16;


import javax.persistence.*;
import java.time.*;

@Entity
public class Events {
    @Id
    @GeneratedValue
    private long id;

    private String event_name;
    private LocalDate start ;
    private LocalDate end ;

    @OneToOne
    @JoinColumn(name = "rooms_id", referencedColumnName = "id")
    private Rooms rooms;

}
