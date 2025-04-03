package com.simple.basic.memomapper;

import command.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper //반드시 붙여야함
public interface MemoMapper {

     String getTime();
     void memoInsert(TestVO vo);
     ArrayList<TestVO> getList();


}
