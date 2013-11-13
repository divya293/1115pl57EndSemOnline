import static org.junit.Assert.*;

import org.junit.Test;


public class Stories_test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Stories story =new Stories(4,1);
		assertEquals(4,story.getStory_points());
		assertEquals(1,story.getPriority_number());
		
	}

}
