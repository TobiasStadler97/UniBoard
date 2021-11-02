package UniBoard.service;

import UniBoard.repository.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionService {
    @Autowired
    private DiscussionRepository discussionRepository;
}
