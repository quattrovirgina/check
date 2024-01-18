package com.green.gradleg1.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResVo {
    @Schema(name= "성공여부 플래그", description = "1: 성공, 0: 실패")
    private int result;

}
