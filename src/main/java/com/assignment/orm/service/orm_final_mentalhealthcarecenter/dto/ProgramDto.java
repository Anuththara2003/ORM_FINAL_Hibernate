package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProgramDto {
    private String theraphy_pro_id;
    private String name;
    private String duration;
    private double fee;
    private String description;
}
