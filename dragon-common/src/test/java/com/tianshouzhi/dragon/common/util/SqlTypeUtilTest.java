package com.tianshouzhi.dragon.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tianshouzhi on 2017/6/25.
 */
public class SqlTypeUtilTest {
	@Test
	public void parseSqlType() throws Exception {
		String sql = "INSERT INTO article(title,abstracts,content,visible,qr_code_url,create_time,last_update_time)\n"
		      + "        VALUES (?,?,?,?,?,?,?);";
		SqlType sqlType = SqlTypeUtil.parseSqlType(sql);
		assert sqlType == SqlType.INSERT;
	}

}