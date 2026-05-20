package az.edu.ada.wm2.courseservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PrerequisiteNotMetException extends RuntimeException {
    public PrerequisiteNotMetException(Long courseId, Long prereqId) {
        super(String.format("Tələbə bu kursa yazıla bilməz! Kurs ID %d üçün əvvəlcədən tələb olunan pre-rekvizit kurs ID %d tamamlanmayıb.", courseId, prereqId));
    }
}
