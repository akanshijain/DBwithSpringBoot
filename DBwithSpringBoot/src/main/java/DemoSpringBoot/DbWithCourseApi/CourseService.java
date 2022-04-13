package DemoSpringBoot.DbWithCourseApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("12","Pratishta","manager"),
			new Topic("34","Ramiya","salesgirl"),
			new Topic("45","Sonalika","executive")
			));  */

	
	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Course course  = courseRepository.findById(id).get();
		return course;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
	   courseRepository.save(course);
		}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		
		courseRepository.deleteById(id);
		
	}

	public List<Course> getAllCourses(String id) {
		
		List<Course> courses = new ArrayList<>();
		  courseRepository.findByTopicId(id).forEach(courses::add);
		  return courses;
	}

}
