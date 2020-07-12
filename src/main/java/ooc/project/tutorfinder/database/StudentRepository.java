package ooc.project.tutorfinder.database;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByUsername(String username);

}
