package az.edu.ada.wm2.courseservice.client;

import az.edu.ada.wm2.courseservice.model.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@FeignClient(name = "student-service", url = "${student.service.base-url}/api/v1/students")
public interface StudentFeignClient {

    @GetMapping("/{id}")
    StudentDto getStudentById(@PathVariable("id") Long id);

    @GetMapping("/search")
    List<StudentDto> searchStudentsByName(@RequestParam("name") String name);
}