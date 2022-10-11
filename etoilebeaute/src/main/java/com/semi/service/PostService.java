package com.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.dto.PostDTO;
import com.semi.frame.MyService;
import com.semi.mapper.PostMapper;

@Service
public class PostService implements MyService<Integer,PostDTO> {

	@Autowired
	PostMapper mapper;
	
	@Override
	public void register(PostDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(PostDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public PostDTO get(Integer k) throws Exception {
	
		return mapper.select(k);
	}

	@Override
	public List<PostDTO> getall() throws Exception {
		
		return mapper.selectall();
	}

}
