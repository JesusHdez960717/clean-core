package com.clean.core.app.services;

/**
 *
 * @author Jes�s Hern�ndez Barrios (jhernandezb96@gmail.com)
 * @param <UserType>
 * @param <PassType>
 * @param <ArgsType>
 * @param <AnswType>
 */
public interface LoginHandlerService<UserType, PassType, ArgsType, AnswType> {

    public AnswType login(UserType user, PassType pass, ArgsType... args);

}
