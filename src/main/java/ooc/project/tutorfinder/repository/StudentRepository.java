package ooc.project.tutorfinder.repository;

import ooc.project.tutorfinder.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByUsername(String username);

    boolean existsByUsername(String username);
}
