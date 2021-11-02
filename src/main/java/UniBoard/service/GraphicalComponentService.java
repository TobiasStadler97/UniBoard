package UniBoard.service;

import UniBoard.repository.GraphicalComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraphicalComponentService {
    @Autowired
    private GraphicalComponentRepository graphicalComponentRepository;
}
