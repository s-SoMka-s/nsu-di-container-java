package framework.beans;

import java.lang.annotation.Annotation;

public class ComponentNode {
    private final ComponentClass component;
    private final ComponentType type;
    private final Annotation[] annotations;

    // Создание рут компонента
    public ComponentNode(ComponentClass component) {
        this.component = component;
        this.annotations = component.getType().getAnnotations();
        this.type = ComponentType.Component;
    }


    public ComponentNode(ComponentClass component, ComponentType type, Annotation[] annotations) {
        this.component = component;
        this.annotations = annotations;
        this.type = type;
    }
}
