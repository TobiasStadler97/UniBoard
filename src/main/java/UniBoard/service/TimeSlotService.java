package UniBoard.service;

import UniBoard.repository.TimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeSlotService {
    @Autowired
    private TimeSlotRepository timeSlotRepository;
}
