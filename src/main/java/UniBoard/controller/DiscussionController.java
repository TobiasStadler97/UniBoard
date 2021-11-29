package UniBoard.controller;


import UniBoard.entity.domaindata.Discussion;
import UniBoard.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @GetMapping("/discussion/{course_id}")
    List<Discussion> getDiscussionsByCourseId(@PathVariable int course_id){
        return discussionService.getDiscussionsByCourseID(course_id);
    }


    @PostMapping("/discussion")
    void addDiscussion(@RequestBody Discussion newDiscussion){
        discussionService.save(newDiscussion);
    }

    @DeleteMapping("/discussion/{id}")
    void deleteDiscussion(@PathVariable int id){
        discussionService.deleteById(id);
    }


}
