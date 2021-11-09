package UniBoard.service;

import UniBoard.entity.domaindata.Comment;
import UniBoard.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public List<Comment> findAll(Sort sort) {
        return commentRepository.findAll(sort);
    }

    public List<Comment> findAllById(Iterable<Integer> integers) {
        return commentRepository.findAllById(integers);
    }

    public <S extends Comment> List<S> saveAll(Iterable<S> entities) {
        return commentRepository.saveAll(entities);
    }

    public void flush() {
        commentRepository.flush();
    }

    public <S extends Comment> S saveAndFlush(S entity) {
        return commentRepository.saveAndFlush(entity);
    }

    public <S extends Comment> List<S> saveAllAndFlush(Iterable<S> entities) {
        return commentRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Comment> entities) {
        commentRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Comment> entities) {
        commentRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        commentRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        commentRepository.deleteAllInBatch();
    }

    @Deprecated
    public Comment getOne(Integer integer) {
        return commentRepository.getOne(integer);
    }

    public Comment getById(Integer integer) {
        return commentRepository.getById(integer);
    }

    public <S extends Comment> List<S> findAll(Example<S> example) {
        return commentRepository.findAll(example);
    }

    public <S extends Comment> List<S> findAll(Example<S> example, Sort sort) {
        return commentRepository.findAll(example, sort);
    }

    public Page<Comment> findAll(Pageable pageable) {
        return commentRepository.findAll(pageable);
    }

    public <S extends Comment> S save(S entity) {
        return commentRepository.save(entity);
    }

    public Optional<Comment> findById(Integer integer) {
        return commentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return commentRepository.existsById(integer);
    }

    public long count() {
        return commentRepository.count();
    }

    public void deleteById(Integer integer) {
        commentRepository.deleteById(integer);
    }

    public void delete(Comment entity) {
        commentRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        commentRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Comment> entities) {
        commentRepository.deleteAll(entities);
    }

    public void deleteAll() {
        commentRepository.deleteAll();
    }

    public <S extends Comment> Optional<S> findOne(Example<S> example) {
        return commentRepository.findOne(example);
    }

    public <S extends Comment> Page<S> findAll(Example<S> example, Pageable pageable) {
        return commentRepository.findAll(example, pageable);
    }

    public <S extends Comment> long count(Example<S> example) {
        return commentRepository.count(example);
    }

    public <S extends Comment> boolean exists(Example<S> example) {
        return commentRepository.exists(example);
    }
}
