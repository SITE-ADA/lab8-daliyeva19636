package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDto {

    @Schema(description = "Kursun unikal verilənlər bazası ID-si", example = "2")
    private Long id;

    @Schema(description = "Kursun adı", example = "Design and Analysis of Algorithms")
    private String title;

    @Schema(description = "Kursun kodu", example = "CSCI301")
    private String code;

    @Schema(description = "Kursun kredit miqdarı", example = "6")
    private Integer credits;

    @Schema(description = "Pre-rekvizit kursun ID-si. Yoxdursa null qaytarır.", example = "1", nullable = true)
    private Long prerequisiteCourseId;
}
