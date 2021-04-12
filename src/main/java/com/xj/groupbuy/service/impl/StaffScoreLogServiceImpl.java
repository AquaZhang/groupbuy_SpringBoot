package com.xj.groupbuy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.StaffScore;
import com.xj.groupbuy.entity.StaffScoreLog;
import com.xj.groupbuy.mapper.StaffScoreLogMapper;
import com.xj.groupbuy.service.IStaffScoreLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-04-12
 */
@Service
public class StaffScoreLogServiceImpl extends ServiceImpl<StaffScoreLogMapper, StaffScoreLog> implements IStaffScoreLogService {

    @Autowired
    private StaffScoreLogMapper staffScoreLogMapper;
    
    @Override
    public CommonVO getStaffScoreLogs(String userId) {

        List<StaffScoreLog> logs = staffScoreLogMapper.selectList(new QueryWrapper<StaffScoreLog>().eq("user_id", userId));
        return new CommonVO(true,logs);
    }
}
