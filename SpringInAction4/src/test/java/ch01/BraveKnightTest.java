package ch01;

//import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class BraveKnightTest
{

	@Test
	public void test()
	{
		Quest mockQuest=mock(Quest.class);
		BraveKnight knight=new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
//		fail("Not yet implemented");
	}

}
