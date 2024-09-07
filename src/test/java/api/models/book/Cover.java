package api.models.book;

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
public class Cover{

	@JsonProperty("path")
	private String path;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("updated_by")
	private int updatedBy;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("created_by")
	private int createdBy;

	@JsonProperty("uploaded_to")
	private int uploadedTo;

	@JsonProperty("url")
	private String url;
}