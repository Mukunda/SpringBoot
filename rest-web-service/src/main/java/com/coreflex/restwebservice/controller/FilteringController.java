package com.coreflex.restwebservice.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coreflex.restwebservice.bean.Filter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filter")
	public MappingJacksonValue retrieveFilteredBean() {
		Filter filterBean = new Filter("mukundan", "mukunda", "mukundan@coreflexsolutions.com");
		MappingJacksonValue mapping = new MappingJacksonValue(filterBean);
		mapping.setFilters(returnFilterProvider(new HashSet<String>(Arrays.asList("userName","email"))));
		return mapping;
	}

	@GetMapping("/filter-list")
	public MappingJacksonValue retrieveFilteredBeanList() {
		List<Filter> filterBeanList = Arrays.asList(new Filter("mukundan", "mukunda", "mukundan@coreflexsolutions.com"),
				new Filter("mukundan", "mukunda", "mukundan@coreflexsolutions.com"));
		MappingJacksonValue mapping = new MappingJacksonValue(filterBeanList);
		mapping.setFilters(returnFilterProvider(new HashSet<String>(Arrays.asList("userName"))));
		return mapping;
	}
	
	public static FilterProvider returnFilterProvider (Set<String> properties)
	{
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(properties);
		FilterProvider filters = new SimpleFilterProvider().addFilter("Filter", filter);
		return filters;
	}
}
