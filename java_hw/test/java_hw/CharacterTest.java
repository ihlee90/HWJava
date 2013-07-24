package java_hw;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testCreate() throws Exception {
		assertEquals( true, Character.isWhitespace('\n') );
		assertEquals(true, Character.isWhitespace('\t')) ;
		assertEquals(true, Character.isWhitespace(' ')) ;
	}

}
