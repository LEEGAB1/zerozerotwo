package zerozerotwo;

import static org.junit.Assert.*;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

public class nn {

	@Test
	public void test() {
		BasicDataSource ds = new BasicDataSource();
		assertNotNull(ds);
	}

}
