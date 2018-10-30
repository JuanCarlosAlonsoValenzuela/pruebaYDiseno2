
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class PersonalRecord extends DomainEntity {

	private String	fullName;
	private String	photo;
	private String	email;
	private String	phoneNumber;
	private String	urlLinkedInProfile;


	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	@NotBlank
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	@NotBlank
	@URL
	public String getPhoto() {
		return this.photo;
	}

	@NotBlank
	@URL
	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	@NotBlank
	public String getEmail() {
		return this.email;
	}

	@Email
	@NotBlank
	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@NotBlank
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@NotBlank
	@URL
	public String getUrlLinkedInProfile() {
		return this.urlLinkedInProfile;
	}

	@NotBlank
	@URL
	public void setUrlLinkedInProfile(final String urlLinkedInProfile) {
		this.urlLinkedInProfile = urlLinkedInProfile;
	}

}