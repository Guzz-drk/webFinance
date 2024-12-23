package br.com.dev.guzz.web_finance.category.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CategoryDTO {

    private Long id;

    private String name;

    private boolean active;

}
