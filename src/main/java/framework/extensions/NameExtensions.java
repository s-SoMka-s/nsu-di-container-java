package framework.extensions;

import framework.annotations.Component;
import framework.annotations.Inject;

import java.lang.reflect.Field;

public class NameExtensions {
    public static String getInjectableFieldName(Field field) {
        var name = field.getAnnotation(Inject.class).value();
        if (name.isEmpty() || name.isBlank()) {
            return getDefaultName(field.getType());
        }

        return name;
    }

    public static String getComponentName(Class<?> item) {
        var name = item.getAnnotation(Component.class).value();
        if (name.isEmpty() || name.isBlank()) {
            return getDefaultName(item);
        }

        return name;
    }

    public static String getDefaultName(Class<?> item) {
        var divided = item.getTypeName().split("\\.");
        var className = divided[divided.length - 1];

        return className;
    }
}
