package com.kenny.JobBoardPlatformforconnectingJobSeekerswithemployers.dao;


import com.kenny.JobBoardPlatformforconnectingJobSeekerswithemployers.model.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
