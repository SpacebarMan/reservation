package com.cxf.dao;

import com.cxf.entity.Rule;
import com.cxf.entity.*;

import java.util.List;

public interface BasicInfoDaoMapper {
    /**
     * 上传一级科室信息
     * @return  一级科室信息
     */
    List<DeptInfoTop> upDeptInfoTopService();

    /**
     * 上传二级科室信息
     * @return  二级科室信息
     */
    List<DeptInfoTwo> upDeptInfoTwoService();

    /**
     * 上传医生信息
     * @return  医生集合
     */
    List<DoctInfo> upDoctInfoService();

    /**
     *  上传门诊信息
     * @return  门诊信息的集合
     */
    List<OutPatInfo> upOutPatInfoService();

    /**
     *  上传停诊信息
     * @return  停诊信息的集合
     */
    List<StopScheduleInfo> upStopScheduleInfoService();

    /**
     * 上传替诊
     * @return  替诊信息的集合
     */
    List<ReplaceScheduleInfo> upReplaceScheduleInfoService();

    /**
     *  上传预约状态更更新
     * @return  状态更新的集合
     */
    List<OrderStatus> upOrderStatusService();


    /**
     * 上传规则
     * @return  规则上传 [ 不可以随便修改 ]
     */
    List<Rule> upRuleInfoService();
}
