package telran.ashkelon2020.student.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import telran.ashkelon2020.student.model.Student;

public interface StudentRepositoryMongoDB extends MongoRepository<Student, Integer> {
	
		Stream<Student> findByName(String name);
		
		long countByNameIn(List<String> names);
		
		Stream<Student> findPleaseBy();
		
		@Query("{'scores.?0':{'$gte':?1}}")
		Stream<Student> findByExamAndScoreGreaterThanEqual(String exam, int score);
}
