package az.edu.ada.wm2.courseservice.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseStudentsResponseDto {

    @Schema(description = "Course id", example = "1")
    private Long courseId;

    @Schema(description = "Course title", example = "Data Structures")
    private String courseTitle;

    @Schema(description = "Students enrolled in this course along with their enrollment dates")
    private List<EnrolledStudentDto> students;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EnrolledStudentDto {
        @Schema(description = "Student profile information")
        private StudentDto studentDetails;

        @Schema(description = "The exact date and time the student enrolled", example = "2026-05-20T21:57:00")
        private LocalDateTime enrollmentDate;
    }
}
