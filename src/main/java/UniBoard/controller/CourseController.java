package UniBoard.controller;

import UniBoard.entity.domaindata.Course;
import UniBoard.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{id}")
    Course getCourse(@PathVariable int id) {
        return courseService.getById(id);
    }

    @PostMapping("/course")
    void newCourse(@RequestBody Course newCourse){
        courseService.save(newCourse);
    }

    @DeleteMapping("/course/{id}")
    void deleteCourse(@PathVariable int id){
        courseService.deleteById(id);
    }
}
