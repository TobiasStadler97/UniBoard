package UniBoard.service;

import UniBoard.repository.CommentAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentAreaService {
    @Autowired
    private CommentAreaRepository commentAreaRepository;
}
