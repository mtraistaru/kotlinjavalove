package com.ancestor.kotlinJavaLove;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ancestor on 13/02/2018.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PageScope {
}
