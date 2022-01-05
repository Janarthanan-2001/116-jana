package com.maricus.employee.vo;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProjectVO {
	
	private long id;
	private String projectName;
	private String technologyId;

}
