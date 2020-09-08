package com.ev.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ev.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
