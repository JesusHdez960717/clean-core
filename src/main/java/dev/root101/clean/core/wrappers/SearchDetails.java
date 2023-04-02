package dev.root101.clean.core.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.root101.clean.core.utils.validation.annotations.Sort;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDetails {

    @NotNull
    @PositiveOrZero
    @JsonProperty("page")
    private int page;

    @NotNull
    @Min(1)
    @JsonProperty("size")
    private int size;

    @JsonProperty("filter")
    Map<String, String> filter;

    @Sort
    @JsonProperty("sort")
    Map<String, String> sort;
}
