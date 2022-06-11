package vsu.ponomarenko.v16;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.ponomarenko.v16.Entity.Departaments;

public interface DepartamentsReposetory extends JpaRepository<Departaments, Long> {

}
