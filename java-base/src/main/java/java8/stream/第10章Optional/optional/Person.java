
package java8.stream.第10章Optional.optional;

import lombok.Data;

import java.util.Optional;

/**
 * <b>功能描述:</b><br> 
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2020-11-15 17:42 
 */
@Data
public class Person {
    /**代码中`person`引用的是`Optional<Car>`, car引用的是`Optional<Insurance>`，可能拥有也可能没有`car`的情形，car可能进行了`Insurance`，也可能没有`Insurance`。 */
    private Optional<Car> car;
}