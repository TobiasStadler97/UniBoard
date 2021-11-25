package UniBoard;

import UniBoard.entity.domaindata.*;
import UniBoard.entity.users.Professor;
import UniBoard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class UniBoardApplication {

    @Autowired
    CommentService commentService;

    @Autowired
    CourseService courseService;

    @Autowired
    DiscussionService discussionService;

    @Autowired
    FacultyService facultyService;

    @Autowired
    PersonService personService;

    @Autowired
    ProfessorService professorService;

    @Autowired
    SemesterService semesterService;

    @Autowired
    StudentService studentService;

    @Autowired
    TimeSlotService timeSlotService;

    public static void main(String[] args) {
        SpringApplication.run(UniBoardApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void execCodeAfterStartup(){

        // declare and init classes
        Professor professor = new Professor();

        Comment comment = new Comment();
        Course course = new Course();
        Discussion discussion = new Discussion();
        Faculty faculty = new Faculty();
        Semester semester = new Semester();
        TimeSlot timeSlot = new TimeSlot();

        // make classes persistent
        personService.save(professor);
        commentService.save(comment);
        courseService.save(course);
        discussionService.save(discussion);
        facultyService.save(faculty);
        semesterService.save(semester);
        timeSlotService.save(timeSlot);

    }

    // test
}
