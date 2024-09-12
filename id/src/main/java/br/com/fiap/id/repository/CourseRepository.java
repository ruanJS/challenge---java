package br.com.fiap.id.repository;

import br.com.fiap.id.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
