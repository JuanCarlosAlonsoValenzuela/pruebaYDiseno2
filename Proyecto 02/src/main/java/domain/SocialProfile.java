
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class SocialProfile extends DomainEntity {

	private String	nick;
	private String	name;
	private String	profileLink;


	@NotBlank
	public String getNick() {
		return this.nick;
	}

	@NotBlank
	public void setNick(final String nick) {
		this.nick = nick;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	@NotBlank
	public void setName(final String name) {
		this.name = name;
	}

	@NotBlank
	@URL
	public String getProfileLink() {
		return this.profileLink;
	}

	@NotBlank
	@URL
	public void setProfileLink(final String profileLink) {
		this.profileLink = profileLink;
	}

}