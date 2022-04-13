package DemoSpringBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("12","Pratishta","manager"),
			new Topic("34","Ramiya","salesgirl"),
			new Topic("45","Sonalika","executive")
			));  */
	

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
	  topicRepository.findAll().forEach(topics::add);
	  return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Topic top  = topicRepository.findById(id).get();
		return top;
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
	   topicRepository.save(topic);
		}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		
		topicRepository.deleteById(id);
		
	}

}
