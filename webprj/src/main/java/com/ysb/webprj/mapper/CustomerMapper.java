package com.ysb.webprj.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface CustomerMapper {
	int test();
	String testDB(@Param("str") String str);
}
