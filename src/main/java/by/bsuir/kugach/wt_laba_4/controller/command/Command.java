package by.bsuir.kugach.wt_laba_4.controller.command;

import by.bsuir.kugach.wt_laba_4.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
