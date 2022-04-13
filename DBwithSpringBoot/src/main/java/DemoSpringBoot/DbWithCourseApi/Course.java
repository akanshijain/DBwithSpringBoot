package DemoSpringBoot.DbWithCourseApi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import DemoSpringBoot.Topic;

@Entity
public class Course {
	
	  @Id
	  private String id;
	   private String name;
	   private String jobRole;
	   
	   @ManyToOne
	   private Topic topic;
    
	   public Course(){}
	public Course(String id, String name, String jobRole,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.jobRole = jobRole;
		this.topic = new Topic(topicId,"","");
	}

	public Topic getTopic() {
		return topic;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public void setTopic(Topic topic) {
		this.topic=topic;
		
	}

}
