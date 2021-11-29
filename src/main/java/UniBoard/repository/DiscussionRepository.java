package UniBoard.repository;

import UniBoard.entity.domaindata.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, Integer> {

    @Query("SELECT d FROM Discussion d WHERE d.course.id = ?1")
    List<Discussion> getDiscussionsByCourseId(int courseId);
}
