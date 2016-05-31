package com.gongdan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gongdan.common.entity.TaskInfo;
import com.gongdan.common.support.Pager;

@Repository
public interface TaskInfoDao {
	
	/**
	 *  分页查询
	 * @param quertyTime
	 * @param type
	 * @param pager
	 * @return
	 */
	public List<TaskInfo>  queryTaskInfoList(String quertyTime,Integer type,Long taskTypeId,Pager pager);

	/**
	 * 根据任务类型获取任务列表
	 * @param queryTime,
	 * @param flag，1上拉 2:下拉刷新
	 * @param type 任务类型
	 * @return
	 */
	public List<TaskInfo> queryTaskListByType(String queryTime,Integer flag,List<Integer> taskType);
	
	
	/**
	 * 获取自己的任务列表
	 * 
	 * @param queryTime
	 * @param flag 1上拉 2:下拉刷新
	 * @param userNum 工号
	 * @param type 1:表示自己创建的任务，2:表示自己接受的任务
	 * @return
	 */
	public List<TaskInfo> queryTaskListByUserNum(String queryTime,Integer flag,String userNum,Integer type);
	
	
	
	public TaskInfo getTaskInfo(Long taskId);
	
	
	public Long createTask(TaskInfo info);
	
	
	public void updateTask(TaskInfo info);
}
