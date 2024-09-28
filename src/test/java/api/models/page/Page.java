package api.models.page;

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
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page{

	@JsonProperty("template")
	private boolean template;

	@JsonProperty("editor")
	private String editor;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("owned_by")
	private OwnedBy ownedBy;

	@JsonProperty("book_id")
	private int bookId;

	@JsonProperty("priority")
	private int priority;

	@JsonProperty("revision_count")
	private int revisionCount;

	@JsonProperty("created_by")
	private CreatedBy createdBy;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("draft")
	private boolean draft;

	@JsonProperty("name")
	private String name;

	@JsonProperty("updated_by")
	private UpdatedBy updatedBy;

	@JsonProperty("markdown")
	private String markdown;

	@JsonProperty("html")
	private String html;

	@JsonProperty("id")
	private int id;

	@JsonProperty("chapter_id")
	private int chapterId;

	@JsonProperty("raw_html")
	private String rawHtml;

	@JsonProperty("slug")
	private String slug;
}