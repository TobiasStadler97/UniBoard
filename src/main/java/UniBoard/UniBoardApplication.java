package UniBoard;

import UniBoard.entity.domaindata.*;
import UniBoard.entity.graphic.CourseGC;
import UniBoard.entity.graphic.FacultyGC;
import UniBoard.entity.graphic.SemesterGC;
import UniBoard.entity.users.Admin;
import UniBoard.entity.users.Professor;
import UniBoard.entity.users.Tutor;
import UniBoard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class UniBoardApplication {

    @Autowired
    AdminService adminService;

    @Autowired
    CommentAreaService commentAreaService;

    @Autowired
    CommentService commentService;

    @Autowired
    CourseGCService courseGCService;

    @Autowired
    CourseService courseService;

    @Autowired
    DiscussionService discussionService;

    @Autowired
    FacultyGCService facultyGCService;

    @Autowired
    FacultyService facultyService;

    @Autowired
    GraphicalComponentService graphicalComponentService;

    @Autowired
    PersonService personService;

    @Autowired
    ProfessorService professorService;

    @Autowired
    SemesterGCService semesterGCService;

    @Autowired
    SemesterService semesterService;

    @Autowired
    StudentService studentService;

    @Autowired
    TextFieldService textFieldService;

    @Autowired
    TimeSlotService timeSlotService;

    @Autowired
    TutorService tutorService;

    public static void main(String[] args) {
        SpringApplication.run(UniBoardApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void execCodeAfterStartup(){

        // declare and init classes
        Admin admin = new Admin();
        Professor professor = new Professor();
        Tutor tutor = new Tutor();

        CourseGC courseGC = new CourseGC();
        FacultyGC facultyGC = new FacultyGC();
        SemesterGC semesterGC = new SemesterGC();

        Comment comment = new Comment();
        CommentArea commentArea = new CommentArea();
        Course course = new Course();
        Discussion discussion = new Discussion();
        Faculty faculty = new Faculty();
        Semester semester = new Semester();
        TimeSlot timeSlot = new TimeSlot();

        // make classes persistent
        adminService.save(admin);
        personService.save(professor);
        tutorService.save(tutor);
        courseGCService.save(courseGC);
        facultyGCService.save(facultyGC);
        semesterGCService.save(semesterGC);
        commentService.save(comment);
        commentAreaService.save(commentArea);
        courseService.save(course);
        discussionService.save(discussion);
        facultyService.save(faculty);
        semesterService.save(semester);
        timeSlotService.save(timeSlot);

    }

    // test
}
