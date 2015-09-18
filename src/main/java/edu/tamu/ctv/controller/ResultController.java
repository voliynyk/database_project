package edu.tamu.ctv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.tamu.ctv.service.ResultService;


@Controller
public class ResultController
{
	private final Logger logger = LoggerFactory.getLogger(ResultController.class);
	
	@Autowired
	private ResultService resultService;
	
	@RequestMapping(value = "/results/update/byid", method = RequestMethod.POST)
	public String updateResultById(@RequestParam("id") Long id, @RequestParam("value") String value)
	{
		logger.debug("updateResultById() : {}", id, value);

		//resultService.updateResultById(id, value);
		return value;
	}
	
	@RequestMapping(value = "/results/update/byunique", method = RequestMethod.POST)
	public String updateResultByUnique(@RequestParam("rows[]") List<String> rows, @RequestParam("column") String column, @RequestParam("value") String value)
	{
		logger.debug("updateResultByUnique() : {}");

		//analysisService.updateResultById(id, value);
		return value;
	}
}
