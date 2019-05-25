package com.mallplus.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mallplus.common.entity.oms.OmsOrder;
import com.mallplus.common.vo.CartParam;
import com.mallplus.order.vo.GroupAndOrderVo;
import com.mallplus.order.vo.OmsMoneyInfoParam;
import com.mallplus.order.vo.OmsOrderDeliveryParam;
import com.mallplus.order.vo.OmsReceiverInfoParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author zscat
 * @since 2019-04-17
 */
public interface IOmsOrderService extends IService<OmsOrder> {
    /**
     * 修改订单收货人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);


    /**
     * 批量发货
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     */
    @Transactional
    int close(List<Long> ids, String note);

    Object preSingelOrder(GroupAndOrderVo orderParam);

    Object generateSingleOrder(GroupAndOrderVo orderParam);

    Object addCart(CartParam cartParam);
}
