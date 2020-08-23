package telran.ashkelon2020.student.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import telran.ashkelon2020.student.model.Student;

public interface StudentRepositoryMongoDB extends PagingAndSortingRepository<Student, Integer> {

}
