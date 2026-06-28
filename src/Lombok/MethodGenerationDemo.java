package Lombok;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, callSuper = false)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MethodGenerationDemo {

    @EqualsAndHashCode.Include
    private Long id;

    @ToString.Include
    private String username;

    @ToString.Include
    private String email;

    private String password;

    @Getter(lombok.AccessLevel.PROTECTED)
    private String sensitiveToken;
}