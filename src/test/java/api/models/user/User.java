package api.models.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User{

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("send_invite")
		private boolean sendInvite;

	@JsonProperty("roles")
	private List<Roles> roles;

	@JsonProperty("roles.")
	private Integer rolesInt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("language")
	private String language;

	@JsonProperty("email")
	private String email;

	@JsonProperty("password")
	private String password;


}