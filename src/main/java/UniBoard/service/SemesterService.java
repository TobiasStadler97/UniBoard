package UniBoard.service;

import UniBoard.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;
}
