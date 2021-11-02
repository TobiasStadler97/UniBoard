package UniBoard.repository;

import UniBoard.entity.graphic.GraphicalComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface GraphicalComponentRepository extends JpaRepository<GraphicalComponent, Integer> {
}
