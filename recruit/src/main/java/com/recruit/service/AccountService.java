package com.recruit.service;

import com.recruit.vo.AccountVO;

public interface AccountService{
	
	public void register(AccountVO account) throws Exception;
	
	public AccountVO login(AccountVO account) throws Exception;

	boolean checkId(String memberId); 
	
	public String searchId(String email);
	
	public String searchPasswd(String email, String memberId);
	
}