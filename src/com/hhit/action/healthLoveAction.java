package com.hhit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

@Controller
@ParentPackage("json-default")
@Namespace("/")
@ExceptionMappings( { @org.apache.struts2.convention.annotation.ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })

public class healthLoveAction
{
	@Action(value = "/healthProject",  results = { @org.apache.struts2.convention.annotation.Result(name = "success", type = "freemarker", location = "/WEB-INF/bootstrap/love_assistance.ftl") })
	 public String healthProject(){
	  return "success";
  }
	
	
}
