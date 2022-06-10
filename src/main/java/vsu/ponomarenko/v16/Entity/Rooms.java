package vsu.ponomarenko.v16.Entity;

import javax.persistence.*;

@Entity
public class Rooms {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    private String room_name;

    @OneToOne
    @JoinColumn(name = "departament_id", referencedColumnName = "id")
    private Departaments departaments;

}
