package pdp_example.lo4j_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	private final static String TEST_STRING_TO_LOG = "Hello World!!!";

	public static void main(String[] args) {
		logger.info(TEST_STRING_TO_LOG);
		logger.debug(TEST_STRING_TO_LOG);
	}
}
