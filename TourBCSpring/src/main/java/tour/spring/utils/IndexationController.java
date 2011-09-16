package tour.spring.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;

public class IndexationController {
	private ResourceBundleMessageSource messageSource;

	@Autowired
	public void setMessageSource(
			final ResourceBundleMessageSource aMessageSource) {
		messageSource = aMessageSource;
	}
}
