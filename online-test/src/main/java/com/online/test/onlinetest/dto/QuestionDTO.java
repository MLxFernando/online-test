package com.online.test.onlinetest.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QuestionDTO extends NewQuestionDTO {
    private Long id;
    private List<OptionDTO> options;
}
