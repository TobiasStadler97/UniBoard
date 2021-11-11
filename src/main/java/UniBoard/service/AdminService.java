package UniBoard.service;

import UniBoard.entity.users.Admin;
import UniBoard.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    public List<Admin> findAll(Sort sort) {
        return adminRepository.findAll(sort);
    }

    public List<Admin> findAllById(Iterable<Integer> integers) {
        return adminRepository.findAllById(integers);
    }

    public <S extends Admin> List<S> saveAll(Iterable<S> entities) {
        return adminRepository.saveAll(entities);
    }

    public void flush() {
        adminRepository.flush();
    }

    public <S extends Admin> S saveAndFlush(S entity) {
        return adminRepository.saveAndFlush(entity);
    }

    public <S extends Admin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return adminRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Admin> entities) {
        adminRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Admin> entities) {
        adminRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        adminRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        adminRepository.deleteAllInBatch();
    }

    @Deprecated
    public Admin getOne(Integer integer) {
        return adminRepository.getOne(integer);
    }

    public Admin getById(Integer integer) {
        return adminRepository.getById(integer);
    }

    public <S extends Admin> List<S> findAll(Example<S> example) {
        return adminRepository.findAll(example);
    }

    public <S extends Admin> List<S> findAll(Example<S> example, Sort sort) {
        return adminRepository.findAll(example, sort);
    }

    public Page<Admin> findAll(Pageable pageable) {
        return adminRepository.findAll(pageable);
    }

    public <S extends Admin> S save(S entity) {
        return adminRepository.save(entity);
    }

    public Optional<Admin> findById(Integer integer) {
        return adminRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return adminRepository.existsById(integer);
    }

    public long count() {
        return adminRepository.count();
    }

    public void deleteById(Integer integer) {
        adminRepository.deleteById(integer);
    }

    public void delete(Admin entity) {
        adminRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        adminRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Admin> entities) {
        adminRepository.deleteAll(entities);
    }

    public void deleteAll() {
        adminRepository.deleteAll();
    }

    public <S extends Admin> Optional<S> findOne(Example<S> example) {
        return adminRepository.findOne(example);
    }

    public <S extends Admin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return adminRepository.findAll(example, pageable);
    }

    public <S extends Admin> long count(Example<S> example) {
        return adminRepository.count(example);
    }

    public <S extends Admin> boolean exists(Example<S> example) {
        return adminRepository.exists(example);
    }
}
