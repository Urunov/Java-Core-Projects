package uz.bepro.lambda1;

import uz.bepro.lambda1.domain.User;
import uz.bepro.lambda1.service.*;

import java.util.function.Predicate;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/13 && 8:45 PM}
 */
public class MainPolyL {
    public static void main(String[] args) {

        MaxCompare test1 = (number, number1) -> (number > number1) ? number : number1;
        MaxCompare test2 = Integer::max; //  :: (reference method )  Reference Method. Silichniy metodiy
        MaxCompare test3 = Math::max;

        System.out.println(test1.max(4, 5));
        System.out.println(test2.max(4, 5));
        System.out.println(test3.max(4, 5));

        DefineSignValue defineSignValue = number -> {
            if (number > 0) {
                System.out.println("Plus...");
            } else if (number < 0) {
                System.out.println("Minus...");
            } else {
                System.out.println("Not defined");
            }
        };

        defineSignValue.defineSign(3.2);
        defineSignValue.defineSign(-32.3);
        defineSignValue.defineSign(0);

        Existing existing = (nums, number) -> {
            for (int num : nums) {
                if (number == num) {
                    return true;
                }
            }
            return false;
        };
        int[] array = {4, 3, 112, 34, 5};

        existing.isExists(array, 5);
        System.out.println(existing.isExists(array, 6));

        StringCompare stringCompare = (s1, s2) -> s1.contains(s2);

        StringCompare stringCom = String::contains;
        System.out.println(stringCom.isContain("Hello", "lo"));

        UserInterface userInterface = User::new; // call to Constructor

        UserInterface userInterface1 = (number1, number2) -> {
            User user = new User(number1, number2);
            return user;
        };

        System.out.println(userInterface.getUser(2, 3));
        //Predicate
    }
}
