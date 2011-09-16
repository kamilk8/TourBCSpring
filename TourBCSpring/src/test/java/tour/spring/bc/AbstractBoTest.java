package tour.spring.bc;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/tour-bc.xml", "classpath:/tour-bc-ds.xml"})
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@TransactionConfiguration(transactionManager="transactionManager")
public class AbstractBoTest extends AbstractTransactionalJUnit4SpringContextTests {

	
	@Before
    public void setUpData() {
//		executeSqlScript("classpath:sql/functions.sql", true);
		executeSqlScript("classpath:sql/insert.sql", true);
    }

	
	
}
