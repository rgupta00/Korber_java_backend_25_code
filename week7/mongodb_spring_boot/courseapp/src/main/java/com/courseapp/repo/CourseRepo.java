package com.courseapp.repo;

import com.courseapp.entities.Course;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface CourseRepo extends MongoRepository<Book, String> {
    //1. find all courses by the instructor, where couse fee is greter then 300
    @Aggregation("{ $match: { 'instructor': ?0, 'courseFee': {$gt: ?1}}}")
    public List<Course>findByInstructorAndCourseFee(String instructor, double courseFee);

}
