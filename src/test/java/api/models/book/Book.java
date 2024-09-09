package api.models.book;

import java.io.File;
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
public class Book {

	@JsonProperty("description")
	private String description;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("owned_by")
	private Integer ownedBy;

	@JsonProperty("default_template_id")
	private Integer defaultTemplateId;

	@JsonProperty("created_by")
	private Integer createdBy;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("cover")
	private Cover cover;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("updated_by")
	private Integer updatedBy;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("description_html")
	private String descriptionHtml;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("image")
	private File image;
}