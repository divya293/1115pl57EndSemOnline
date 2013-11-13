import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class scrum_test {
	Team team;
	Stories story;
	Project project;
	Task task;
	Sprint sprint;
	@Before
	public void setUp() throws Exception {
		team = new Team();
		project= new Project();
		sprint= new Sprint();
		story= new Stories();
		task= new Task();
		
		
	}

	@Test
	public void test() {
		project.setProject_name("Theatre booking system");
		assertEquals("Theatre booking system",project.getProject_name());
		team.setNo_members(6);
		team.setVelocity(5);
team.setProduct_owner("Annu");
team.setScrum_master("Pravin");
team.setTeam_member1("Trisha");
team.setTeam_member2("Pravin");
team.setTeam_member3("Abhishek");
team.setTeam_member4("Prajyot");
team.setTeam_member5("Divya");
assertEquals("Annu",team.getProduct_owner());
assertEquals("Pravin",team.getScrum_master());
assertEquals("Trisha",team.getTeam_member1());
assertEquals("Pravin",team.getTeam_member2());
assertEquals("Abhishek",team.getTeam_member3());
assertEquals("Prajyot",team.getTeam_member4());
assertEquals("Divya",team.getTeam_member5());
		assertEquals(6,team.getNo_members());
		assertEquals(5,team.getVelocity());
	
		sprint.setDuration(2);
		assertEquals(2,sprint.getDuration());
		story.setStory_name("Book tickets");
		sprint.setStories(story.getStory_name());
		task.setTask1("Set objectives");
		task.setTask2("Design Erd");
		task.setTask3("Design UI");
		task.setTask4("Coding");
		task.setTask5("Coding");
		task.setTask6("Coding");
		team.setProduct_owner(task.getTask1());
		team.setScrum_master(task.getTask2());
		team.setTeam_member1(task.getTask3());
		team.setTeam_member2(task.getTask4());
		team.setTeam_member3(task.getTask5());
		team.setTeam_member4(task.getTask6());
		
		
	}

}
