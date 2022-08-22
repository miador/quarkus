package io.quarkus.infinispan.client;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

/**
 * Qualifier used to specify which remote cache will be injected.
 *
 * @author Yusuf Karadag
 */
@Target({ METHOD, FIELD, PARAMETER, TYPE })
@Retention(RUNTIME)
@Documented
@Qualifier
public @interface Multimap {
    /**
     * The remote multimap cache name. If no value is provided the default multimap cache is assumed.
     */
    @Nonbinding
    String value() default "";
}
