package UniBoard.repository;

import UniBoard.entity.graphic.SemesterGC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterGCRepository extends JpaRepository<SemesterGC, Integer> {
}
