package com.hb.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleDaoTest {
	static Logger log = Logger.getLogger(SampleDaoTest.class);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSampleDao() throws ClassNotFoundException, SQLException {
		Assert.assertNotNull(new SampleDao());
	}

	@Test
	public void testSelectAll() throws SQLException, ClassNotFoundException {
		SampleDao dao = new SampleDao();
		
		List<Map<String,Object>> list = dao.selectAll();
		
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size()>0);
		Assert.assertSame(3, list.size());
		for (Map<String, Object> map : list) {
			log.debug(map.get("sabun"));
			log.debug(map.get("name"));
		}
	}

}
