package homeWork1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
@Retention(RetentionPolicy.RUNTIME)
@Target(value={TYPE, FIELD })
public @interface HomeAnnot {
    String value();

}
