package com.wanxin.service;

import java.util.List;

import com.wanxin.entity.Article4Vote;
import com.wanxin.entity.VoteStatic;


/**
 * @author 926474
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
