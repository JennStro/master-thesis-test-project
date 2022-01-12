package tasks;

import annotations.NoEqualsMethod;

@NoEqualsMethod
public class Demo {

    public void method(int number) {
        if (number == 0) {
            System.out.println(number);
        }
    }

}
