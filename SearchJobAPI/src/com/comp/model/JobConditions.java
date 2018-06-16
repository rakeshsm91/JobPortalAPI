package com.comp.model;

import java.util.Set;

public class JobConditions {

	private String availability;
	private String jobType;
	private int lowPayrate;
	private int highPayrate;
	private String experienceLevel;
	private String country;
	
	private Set<String> skills;

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public int getLowPayrate() {
		return lowPayrate;
	}

	public void setLowPayrate(int lowPayrate) {
		this.lowPayrate = lowPayrate;
	}

	public int getHighPayrate() {
		return highPayrate;
	}

	public void setHighPayrate(int highPayrate) {
		this.highPayrate = highPayrate;
	}

	public String getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availability == null) ? 0 : availability.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((experienceLevel == null) ? 0 : experienceLevel.hashCode());
		result = prime * result + highPayrate;
		result = prime * result + ((jobType == null) ? 0 : jobType.hashCode());
		result = prime * result + lowPayrate;
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobConditions other = (JobConditions) obj;
		if (availability == null) {
			if (other.availability != null)
				return false;
		} else if (!availability.equals(other.availability))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (experienceLevel == null) {
			if (other.experienceLevel != null)
				return false;
		} else if (!experienceLevel.equals(other.experienceLevel))
			return false;
		if (highPayrate != other.highPayrate)
			return false;
		if (jobType == null) {
			if (other.jobType != null)
				return false;
		} else if (!jobType.equals(other.jobType))
			return false;
		if (lowPayrate != other.lowPayrate)
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}
	
	
	
}
