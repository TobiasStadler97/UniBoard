package UniBoard.repository;

import UniBoard.entity.graphic.FacultyGC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyGCRepository extends JpaRepository<FacultyGC, Integer> {
}
