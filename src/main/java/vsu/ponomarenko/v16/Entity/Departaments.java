package vsu.ponomarenko.v16.Entity;

import javax.persistence.*;

@Entity
public class Departaments {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Departaments departaments;
}
