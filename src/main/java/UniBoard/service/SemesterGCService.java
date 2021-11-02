package UniBoard.service;

import UniBoard.repository.SemesterGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterGCService {
    @Autowired
    private SemesterGCRepository semesterGCRepository;
}
