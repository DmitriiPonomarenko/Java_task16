package vsu.ponomarenko.v16;


import javax.persistence.*;

@Entity

public class Users {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "departaments_id", referencedColumnName = "id")
    private Departaments departaments;

    @OneToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;
}

