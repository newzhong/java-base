package java8.stream.第10章Optional.optional;

import java8.stream.第10章Optional.Insurance;
import lombok.Data;

import java.util.Optional;

/**
 * <b>功能描述:</b><br> 
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2020-11-15 11:19 
 */
@Data
public class Car {
    private Optional<Insurance> insurance;
}