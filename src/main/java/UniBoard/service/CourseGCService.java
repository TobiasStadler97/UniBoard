package UniBoard.service;

import UniBoard.repository.CourseGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseGCService {
    @Autowired
    private CourseGCRepository courseGCRepository;
}
