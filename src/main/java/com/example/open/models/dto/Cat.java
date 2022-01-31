package com.example.open.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@ApiModel(value = "cat")
public class Cat {
    @ApiModelProperty(value = "Имя кота", example = "Васька")
    private String name;
    @ApiModelProperty(value = "Возраст котика", example = "3.5")
    private BigDecimal age;
    @ApiModelProperty(value = "Из какого же города этот чудо кот??", example = "Все дороги ведут в Москву")
    private Place place;
}
