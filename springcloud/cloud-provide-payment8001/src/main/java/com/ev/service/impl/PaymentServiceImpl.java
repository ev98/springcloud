package com.ev.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ev.entities.Payment;
import com.ev.mapper.PaymentMapper;
import com.ev.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
