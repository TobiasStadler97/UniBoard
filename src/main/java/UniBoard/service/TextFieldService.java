package UniBoard.service;

import UniBoard.repository.TextFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextFieldService {
    @Autowired
    private TextFieldRepository textFieldRepository;
}
