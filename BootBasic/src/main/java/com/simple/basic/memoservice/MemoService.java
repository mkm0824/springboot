package com.simple.basic.memoservice;

import command.TestVO;

import java.util.ArrayList;

public interface MemoService {
    void memoInsert(TestVO vo);
    ArrayList<TestVO> getList();

}
