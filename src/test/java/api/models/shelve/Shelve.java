package api.models.shelve;

import java.util.List;

import api.models.book.TagsItem;
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
public class Shelve {

	@JsonProperty("books")
	private List<Integer> books;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description_html")
	private String descriptionHtml;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("id")
	private Integer id;
}