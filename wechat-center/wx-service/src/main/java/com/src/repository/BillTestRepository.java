package com.src.repository;


import com.batman.k8smybatis.model.BillTest;
import com.batman.k8smybatis.model.BillTestExample;
import com.src.repository.base.BaseRepository;
import mapper.base.BaseMapper;
import mapper.BillTestMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
* BillTestRepository
* Created by src on 2019/6/28.
*/
@Repository
public class BillTestRepository extends BaseRepository<BillTest, BillTestExample> {


    private static final Logger LOGGER = LoggerFactory.getLogger(BillTestRepository.class);

    @Autowired
    BillTestMapperExt mapper;


    @Override
    public BaseMapper getMapper() {
        return mapper;
    }

    public List<BillTest> selectByExamplePage( BillTestExample example,Integer pageNo,Integer pageSize){
        if(pageNo==null)pageNo=0;
        if(pageSize==null)pageSize=20;
        example.setOffset(pageNo*pageSize);
        example.setLimit(pageSize);
        return selectByExample(example);
    }

}




