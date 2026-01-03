package ir.artanpg.commons.core.tools.jacoco;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that a method or constructor should be excluded from JaCoCo code
 * coverage analysis.
 *
 * <p><b>Note:</b> The simple name of this annotation ("Generated") is
 * recognized by JaCoCo's internal filtering mechanism.
 *
 * <p>This annotation is used to mark methods or constructors that are not
 * intended to be covered by unit tests.
 *
 * @author Mohammad Yazdian
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Generated {
}
