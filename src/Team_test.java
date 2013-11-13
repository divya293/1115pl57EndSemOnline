import static org.junit.Assert.*;

import org.junit.Test;


public class Team_test {

	@Test
	public void test() {
		Team team = new Team();
		team.setNo_members(6);
		team.setVelocity(5);
		assertEquals(6,team.getNo_members());
		assertEquals(5,team.getVelocity());
		
	}

}
