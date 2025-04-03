package command;

import lombok.*;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor  //기본생성자
@AllArgsConstructor //멤버변수를 받는 생성자
//@Getter
//@Setter
//@ToString //toString메서드 오버라이딩
@Data //getter + setter + toString 를 합침
@Builder
public class TestVO {

    // 단축키 alt + insert
    private String id;
    @Pattern(regexp = "[0-9]{4}", message = "숫자 4자리 이상입니다")
    private String pw;
    private String name;
    @Size(min = 5, message = "5글자 이상입니다")
    private String memo;
    private Integer mno;
    @Pattern(regexp = "[0-9]{3}-[0-9]{4}-[0-9]{4}", message = "010-0000-0000형식입니다")
    private String phone;
    private String secret;
    private int salary;
    private String address;
    private LocalDateTime hiredate;


}
