package tour.spring.bc.bo;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import tour.spring.bc.AbstractBoTest;
import tour.spring.bc.bo.impl.TourLength;
import tour.spring.bc.bo.impl.TourSearchParameters;
import tour.spring.bc.dto.TourDto;
import tour.spring.bc.model.vo.Tour;

public class TourBoTest extends AbstractBoTest {
	@Autowired
    private TourBo tourBo;
	
	@Test
	public void testQueryAll(){
//		Assert.assertNotNull(tourBo.queryAll());
//		Assert.assertEquals(countRowsInTable("tour"), tourBo.queryAll().size());
//		Assert.assertEquals(countRowsInTable("room"), 55);
		System.out.println("\t -------->>>> kweryol " + tourBo.queryAll().size() + " a w tabeli" +countRowsInTable("tour"));
	}
	
	public void testSearchToursByBasicParams(){
		TourSearchParameters tsp = createBasicTSP();
		Collection<TourDto> tourCol = tourBo.searchTours(tsp);
		Assert.assertNotNull(tourCol);
		Assert.assertTrue(tourCol.size()>0);
		for (TourDto tour : tourCol) {
//			tour.getDateTo() - tour.getDateFrom() > TourLength.ABOVE_WEEK.getMin() && 
		}
		
	}
	
	public void testSearchToursByPlace(){
		Tour t = null;
//		t.getHotel().getPlace() instanceof Region 
	}
	
	private TourSearchParameters createBasicTSP() {
		return  new TourSearchParameters(3, TourLength.ABOVE_WEEK);
	}
	
	
}
