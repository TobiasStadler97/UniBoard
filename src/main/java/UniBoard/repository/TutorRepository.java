package UniBoard.repository;

import UniBoard.entity.users.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {
}
