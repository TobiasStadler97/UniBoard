package UniBoard.controller;


import UniBoard.entity.domaindata.Comment;
import UniBoard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    //comment by discusison id is missing

    @PostMapping("/comment")
    void newComment(@RequestBody Comment newComment){
        commentService.save(newComment);
    }

    @DeleteMapping("comment/{id}")
    void deleteComment(@PathVariable int id){
        commentService.deleteById(id);
    }
}
