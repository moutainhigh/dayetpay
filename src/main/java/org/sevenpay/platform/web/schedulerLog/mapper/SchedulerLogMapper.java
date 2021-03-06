package org.sevenpay.platform.web.schedulerLog.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.sevenpay.platform.web.schedulerLog.bean.SchedulerLog;
@MapperScan
public interface SchedulerLogMapper {
	public List<SchedulerLog>selectSchedulerLogList(SchedulerLog schedulerLog);
	
	int addSchedulerLog(SchedulerLog schedulerLog);
	
	int updateSchedulerLog(SchedulerLog schedulerLog);
}
