package tour.spring.bc.bo;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tour.spring.bc.AbstractBoTest;
import tour.spring.bc.dto.SeasonTypeDto;

public class SeasonBoTest extends AbstractBoTest {

	@Autowired
    private SeasonBo seasonBo;
	
	@Test
	public void testQueryAllSeasonTypes(){
		Collection<SeasonTypeDto> seasons = seasonBo.queryAllSeasonType();
		Assert.assertNotNull(seasons);
		Assert.assertEquals(countRowsInTable("seasontype"), seasonBo.queryAllSeasonType().size());
		
			
	}
}
