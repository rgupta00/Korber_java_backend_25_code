package com.courseapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    private String id;
    private String courseName;
    private String instructor;
    double courseFee;
    String duration;
    boolean isCourseLive;

    public Course(String courseName, String instructor, double courseFee, String duration, boolean isCourseLive) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.courseFee = courseFee;
        this.duration = duration;
        this.isCourseLive = isCourseLive;
    }
}
