package com.batman.mybatis.service.impl;

import com.batman.mybatis.model.Bill;
import com.batman.mybatis.dao.BillMapper;
import com.batman.mybatis.service.BillService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账单表 服务实现类
 * </p>
 *
 * @author yux123
 * @since 2019-06-28
 */
@Service
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements BillService {

}
