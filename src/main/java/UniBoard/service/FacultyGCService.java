package UniBoard.service;

import UniBoard.repository.FacultyGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyGCService {
    @Autowired
    private FacultyGCRepository facultyGCRepository;
}
