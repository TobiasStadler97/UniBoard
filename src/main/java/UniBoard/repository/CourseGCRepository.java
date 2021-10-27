package UniBoard.repository;

import UniBoard.entity.graphic.CourseGC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGCRepository extends JpaRepository<CourseGC, Integer> {
}
