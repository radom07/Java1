package Task1;

import java.lang.reflect.Field;
import java.util.Objects;

public class PasswordValidator {

    public static boolean validate(Object obj) {
        if (obj == null)
            return false;

        Field[] declaredFields = obj.getClass().getDeclaredFields();

        for (Field field : declaredFields) {

            if (field.isAnnotationPresent(PasswordValidation.class)) {
                try {
                    PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);

                    if (field.getType().equals(String.class)) {
                        field.setAccessible(true);
                        String password = (String) field.get(obj);

                        if (!checkRules(password, annotation)) {
                            return false;
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field via reflection", e);
                }
            }
        }
        return true;
    }

    private static boolean checkRules(String password, PasswordValidation annotation) {
        if (password == null || password.length() < annotation.minLength()) {
            return false;
        }

        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        boolean hasSpecial = password.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch));

        if (annotation.requireDigit() && !hasDigit) return false;
        if (annotation.requireSpecialChar() && !hasSpecial) return false;

        return true;
    }
}
