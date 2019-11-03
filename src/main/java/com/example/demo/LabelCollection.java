package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LabelCollection {

	public String name;
	public String bands;
	public String recordLabel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBands() {
		return bands;
	}
	public void setBands(String bands) {
		this.bands = bands;
	}
	public String getRecordLabel() {
		return recordLabel;
	}
	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}
	
	
}
