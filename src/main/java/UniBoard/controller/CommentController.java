package UniBoard.controller;


import UniBoard.entity.domaindata.Comment;
import UniBoard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments") // not yet tested
    Iterable<Comment> getAllComments() {
        return commentService.findAll(Sort.by(Sort.Direction.ASC, "created"));
    }
}
