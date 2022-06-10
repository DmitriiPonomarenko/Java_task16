package vsu.ponomarenko.v16;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Notifications {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Events events;
    private LocalDate notification_time;
}
