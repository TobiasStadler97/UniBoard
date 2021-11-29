package UniBoard;

import UniBoard.entity.domaindata.*;
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



    public static void main(String[] args) {
        SpringApplication.run(UniBoardApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void execCodeAfterStartup(){

        // declare and init classes
        Comment comment = new Comment();
        Course course = new Course();
        Discussion discussion = new Discussion();
        Faculty faculty = new Faculty();

        // make classes persistent
        commentService.save(comment);
        courseService.save(course);
        discussionService.save(discussion);
        facultyService.save(faculty);

    }

    // test
}
