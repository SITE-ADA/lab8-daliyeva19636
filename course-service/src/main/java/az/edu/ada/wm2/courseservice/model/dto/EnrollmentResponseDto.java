package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentResponseDto {

    @Schema(description = "Enrollment record id", example = "1")
    private Long id;

    @Schema(description = "Course id", example = "1")
    private Long courseId;

    @Schema(description = "Student id", example = "5")
    private Long studentId;

    @Schema(description = "Status message", example = "Student enrolled successfully.")
    private String message;

    @Schema(description = "The date and time the enrollment was processed", example = "2026-05-20T22:15:00")
    private LocalDateTime enrollmentDate;
}
