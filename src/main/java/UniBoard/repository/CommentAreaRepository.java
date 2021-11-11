package UniBoard.repository;

import UniBoard.entity.domaindata.CommentArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentAreaRepository extends JpaRepository<CommentArea, Integer> {
}
