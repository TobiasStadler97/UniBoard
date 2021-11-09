package UniBoard.service;

import UniBoard.entity.domaindata.CommentArea;
import UniBoard.repository.CommentAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentAreaService {
    @Autowired
    private CommentAreaRepository commentAreaRepository;

    public List<CommentArea> findAll() {
        return commentAreaRepository.findAll();
    }

    public List<CommentArea> findAll(Sort sort) {
        return commentAreaRepository.findAll(sort);
    }

    public List<CommentArea> findAllById(Iterable<Integer> integers) {
        return commentAreaRepository.findAllById(integers);
    }

    public <S extends CommentArea> List<S> saveAll(Iterable<S> entities) {
        return commentAreaRepository.saveAll(entities);
    }

    public void flush() {
        commentAreaRepository.flush();
    }

    public <S extends CommentArea> S saveAndFlush(S entity) {
        return commentAreaRepository.saveAndFlush(entity);
    }

    public <S extends CommentArea> List<S> saveAllAndFlush(Iterable<S> entities) {
        return commentAreaRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<CommentArea> entities) {
        commentAreaRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<CommentArea> entities) {
        commentAreaRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        commentAreaRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        commentAreaRepository.deleteAllInBatch();
    }

    @Deprecated
    public CommentArea getOne(Integer integer) {
        return commentAreaRepository.getOne(integer);
    }

    public CommentArea getById(Integer integer) {
        return commentAreaRepository.getById(integer);
    }

    public <S extends CommentArea> List<S> findAll(Example<S> example) {
        return commentAreaRepository.findAll(example);
    }

    public <S extends CommentArea> List<S> findAll(Example<S> example, Sort sort) {
        return commentAreaRepository.findAll(example, sort);
    }

    public Page<CommentArea> findAll(Pageable pageable) {
        return commentAreaRepository.findAll(pageable);
    }

    public <S extends CommentArea> S save(S entity) {
        return commentAreaRepository.save(entity);
    }

    public Optional<CommentArea> findById(Integer integer) {
        return commentAreaRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return commentAreaRepository.existsById(integer);
    }

    public long count() {
        return commentAreaRepository.count();
    }

    public void deleteById(Integer integer) {
        commentAreaRepository.deleteById(integer);
    }

    public void delete(CommentArea entity) {
        commentAreaRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        commentAreaRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends CommentArea> entities) {
        commentAreaRepository.deleteAll(entities);
    }

    public void deleteAll() {
        commentAreaRepository.deleteAll();
    }

    public <S extends CommentArea> Optional<S> findOne(Example<S> example) {
        return commentAreaRepository.findOne(example);
    }

    public <S extends CommentArea> Page<S> findAll(Example<S> example, Pageable pageable) {
        return commentAreaRepository.findAll(example, pageable);
    }

    public <S extends CommentArea> long count(Example<S> example) {
        return commentAreaRepository.count(example);
    }

    public <S extends CommentArea> boolean exists(Example<S> example) {
        return commentAreaRepository.exists(example);
    }
}
