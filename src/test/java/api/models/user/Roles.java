package api.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Roles {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("display_name")
    private String displayName;
}
