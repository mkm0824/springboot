package com.simple.basic.memoservice;

import com.simple.basic.memomapper.MemoMapper;
import command.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("/memoService")
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoMapper memoMapper;


    @Override
    public void memoInsert(TestVO vo) {
    memoMapper.memoInsert(vo);
    }

    @Override
    public ArrayList<TestVO> getList() {
        return null;
    }
}
