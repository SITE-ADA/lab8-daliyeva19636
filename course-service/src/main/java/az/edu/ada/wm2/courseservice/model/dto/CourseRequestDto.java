package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDto {

    @NotBlank(message = "Kursun adı boş ola bilməz")
    @Schema(description = "Kursun adı", example = "Data Structures")
    private String title;

    @NotBlank(message = "Kursun kodu boş ola bilməz")
    @Schema(description = "Kursun unikal kodu", example = "CSCI202")
    private String code;

    @NotNull(message = "Kredit miqdarı qeyd olunmalıdır")
    @Min(value = 1, message = "Kredit minimum 1 olmalıdır")
    @Schema(description = "Kursun kredit miqdarı", example = "6")
    private Integer credits;

    @Schema(description = "Pre-rekvizit kursun ID-si. Əgər yoxdursa null.", example = "1", nullable = true)
    private Long prerequisiteCourseId;
}