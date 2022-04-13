package DemoSpringBoot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	  @Id
	  private String id;
	   private String name;
	   private String jobRole;
    
	   public Topic(){}
	public Topic(String id, String name, String jobRole) {
		super();
		this.id = id;
		this.name = name;
		this.jobRole = jobRole;
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
}
