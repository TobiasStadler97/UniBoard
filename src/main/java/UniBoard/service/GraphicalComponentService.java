package UniBoard.service;

import UniBoard.entity.graphic.GraphicalComponent;
import UniBoard.repository.GraphicalComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GraphicalComponentService {
    @Autowired
    private GraphicalComponentRepository graphicalComponentRepository;

    public List<GraphicalComponent> findAll() {
        return graphicalComponentRepository.findAll();
    }

    public List<GraphicalComponent> findAll(Sort sort) {
        return graphicalComponentRepository.findAll(sort);
    }

    public List<GraphicalComponent> findAllById(Iterable<Integer> integers) {
        return graphicalComponentRepository.findAllById(integers);
    }

    public <S extends GraphicalComponent> List<S> saveAll(Iterable<S> entities) {
        return graphicalComponentRepository.saveAll(entities);
    }

    public void flush() {
        graphicalComponentRepository.flush();
    }

    public <S extends GraphicalComponent> S saveAndFlush(S entity) {
        return graphicalComponentRepository.saveAndFlush(entity);
    }

    public <S extends GraphicalComponent> List<S> saveAllAndFlush(Iterable<S> entities) {
        return graphicalComponentRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<GraphicalComponent> entities) {
        graphicalComponentRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<GraphicalComponent> entities) {
        graphicalComponentRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        graphicalComponentRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        graphicalComponentRepository.deleteAllInBatch();
    }

    @Deprecated
    public GraphicalComponent getOne(Integer integer) {
        return graphicalComponentRepository.getOne(integer);
    }

    public GraphicalComponent getById(Integer integer) {
        return graphicalComponentRepository.getById(integer);
    }

    public <S extends GraphicalComponent> List<S> findAll(Example<S> example) {
        return graphicalComponentRepository.findAll(example);
    }

    public <S extends GraphicalComponent> List<S> findAll(Example<S> example, Sort sort) {
        return graphicalComponentRepository.findAll(example, sort);
    }

    public Page<GraphicalComponent> findAll(Pageable pageable) {
        return graphicalComponentRepository.findAll(pageable);
    }

    public <S extends GraphicalComponent> S save(S entity) {
        return graphicalComponentRepository.save(entity);
    }

    public Optional<GraphicalComponent> findById(Integer integer) {
        return graphicalComponentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return graphicalComponentRepository.existsById(integer);
    }

    public long count() {
        return graphicalComponentRepository.count();
    }

    public void deleteById(Integer integer) {
        graphicalComponentRepository.deleteById(integer);
    }

    public void delete(GraphicalComponent entity) {
        graphicalComponentRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        graphicalComponentRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends GraphicalComponent> entities) {
        graphicalComponentRepository.deleteAll(entities);
    }

    public void deleteAll() {
        graphicalComponentRepository.deleteAll();
    }

    public <S extends GraphicalComponent> Optional<S> findOne(Example<S> example) {
        return graphicalComponentRepository.findOne(example);
    }

    public <S extends GraphicalComponent> Page<S> findAll(Example<S> example, Pageable pageable) {
        return graphicalComponentRepository.findAll(example, pageable);
    }

    public <S extends GraphicalComponent> long count(Example<S> example) {
        return graphicalComponentRepository.count(example);
    }

    public <S extends GraphicalComponent> boolean exists(Example<S> example) {
        return graphicalComponentRepository.exists(example);
    }
}
