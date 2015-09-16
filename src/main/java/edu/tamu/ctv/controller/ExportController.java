package edu.tamu.ctv.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.tamu.ctv.entity.Projects;
import edu.tamu.ctv.repository.ProjectsRepository;
import edu.tamu.ctv.service.ExportService;

@Controller
public class ExportController
{
	private final Logger logger = LoggerFactory.getLogger(ExportController.class);

	@Autowired
	private ExportService exportService;
	@Autowired
	private ProjectsRepository projectRepository;
	
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public String export(Model model)
	{
		logger.debug("export()");
		return "export/export";
	}

	@RequestMapping(value = "/export/{id}", method = RequestMethod.GET)
	public void export(@PathVariable("id") Long id, HttpServletResponse response) throws IOException
	{
		logger.debug("export() id: {}", id);
		
		Projects project = projectRepository.findOne(id);
		if (project != null)
		{
			exportService.ExportByProject(project, response);
		}
		else
		{
			String reportName = "error.csv";
			response.setContentType("text/csv");
			response.setHeader("Content-disposition", "attachment;filename=" + reportName);
		}
		response.getOutputStream().flush();
	}
}
