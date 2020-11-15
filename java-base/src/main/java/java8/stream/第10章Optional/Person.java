package java8.stream.第10章Optional;

import lombok.Data;

/**
 * <b>功能描述:</b><br> 
 * @author newzhong
 * @version 1.0.0
 * @since JDK 1.8
 *
 * @Note
 * <b>创建时间:</b> 2020-11-15 11:12 
 */
@Data
public class Person {
    private Car car;

    public String getCarInsuranceName(Person person){
        return person.getCar().getInsurance().getName();
    }
    /**
     * <b>功能描述:采用防御式检查减少 NullPointerException</b>
     * <br><b>注意事项:</b>
     * @author    zhong
     * @version   1.0.0
     * @since     JDK 1.8
     *
     * @return String
     * @param person
     */
    public String getCarInsuranceNameFirst(Person person){
        if (person != null){
            Car car = person.getCar();
            if (car != null){
                Insurance insurance = car.getInsurance();
                if (insurance != null){
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    public String getCarInsuranceNameSafe(Person person){
        // 逆向思维，一般都是判断不为空的情况
        if (person == null){
            // 每个null都增加新的退出点
            return "unknown";
        }
        Car car = person.getCar();
        if (car == null){
            return "unknown";
        }
        Insurance insurance = car.getInsurance();
        if (insurance == null){
            return "unknown";
        }
        return insurance.getName();
    }
}