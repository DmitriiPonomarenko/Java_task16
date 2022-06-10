package vsu.ponomarenko.v16;

import javax.persistence.*;

@Entity
public class Departaments {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Departaments departaments;
}
