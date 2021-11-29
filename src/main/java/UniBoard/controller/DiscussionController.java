package UniBoard.controller;


import UniBoard.entity.domaindata.Discussion;
import UniBoard.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    // get discussions by course id --> might be smarter to have this in the course?

    @PostMapping("/discussion")
    void addDiscussion(@RequestBody Discussion newDiscussion){
        discussionService.save(newDiscussion);
    }

    @DeleteMapping("/discussion/{id}")
    void deleteDiscussion(@PathVariable int id){
        discussionService.deleteById(id);
    }


}
