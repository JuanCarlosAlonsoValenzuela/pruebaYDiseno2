
package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import com.lowagie.text.Section;

@Entity
public class Tutorial {

	private String			title;
	private Date			lastUpdate;
	private String			sumary;
	private List<String>	pictures;

	private List<Section>	sections;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotNull
	@Past
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(final Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@NotBlank
	public String getSumary() {
		return this.sumary;
	}

	public void setSumary(final String sumary) {
		this.sumary = sumary;
	}

	@URL
	public List<String> getPictures() {
		return this.pictures;
	}

	public void setPictures(final List<String> pictures) {
		this.pictures = pictures;
	}

	@NotNull
	public List<Section> getSections() {
		return this.sections;
	}

	public void setSections(final List<Section> sections) {
		this.sections = sections;
	}
}
