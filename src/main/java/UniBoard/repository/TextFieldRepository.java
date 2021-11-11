package UniBoard.repository;

import UniBoard.entity.domaindata.Faculty;
import UniBoard.entity.domaindata.TextField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextFieldRepository extends JpaRepository<TextField, Integer> {
}
