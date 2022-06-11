package vsu.ponomarenko.v16.Controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vsu.ponomarenko.v16.DepartamentsReposetory;
import vsu.ponomarenko.v16.Entity.Departaments;

import java.util.List;

@RestController
public class DepartamentsController {

    private final DepartamentsReposetory departamentsReposetory;

    public DepartamentsController(DepartamentsReposetory departamentsReposetory){
        this.departamentsReposetory = departamentsReposetory;

    }

    @GetMapping("departaments/get")
    public List<Departaments> doGet(@RequestParam Integer page) {
        return departamentsReposetory.findAll(PageRequest.of(page,5)).getContent();
    }


}
