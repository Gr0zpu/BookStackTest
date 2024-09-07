package api.models.book;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("cover")
	private Cover cover;
}