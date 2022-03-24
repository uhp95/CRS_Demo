package com.tcs.crs.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.crs.dao.CrsDao;


@RestController
public class CrsController {

	@Autowired
	private CrsDao crsdao;
	
	@RequestMapping(value = "/Registration", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON )
	public List Details()
	{
		return crsdao.Data();
	}
	
	@RequestMapping(value = "/Registration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON )
	
}
