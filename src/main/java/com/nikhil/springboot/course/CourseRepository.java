package com.nikhil.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Nikhil Das Nomula on 12/24/17.
 */

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
