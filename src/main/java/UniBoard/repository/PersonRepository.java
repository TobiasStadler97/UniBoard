package UniBoard.repository;

import UniBoard.entity.domaindata.Faculty;
import UniBoard.entity.users.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
