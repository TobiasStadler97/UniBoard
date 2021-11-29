package UniBoard.controller;

import UniBoard.entity.domaindata.Faculty;
import UniBoard.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/faculty/{id}")
    Faculty getFacultyById(@PathVariable int id){
        return facultyService.getById(id);
    }

}