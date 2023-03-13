package com.example.news.exception.handler;

import com.example.news.dto.data.DataDto;
import com.example.news.dto.error.AppErrorDto;
import com.example.news.exception.custom.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;

@RestController
@ControllerAdvice("com.example.news_project")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    public ResponseEntity<?> handleBadCredentialsExceptions(BadCredentialsException exception, WebRequest webRequest, HttpServletResponse response) {
        response.setStatus(404);

        return formatToResponseEntity(exception.getMessage(), exception.getDeveloperMessage(), webRequest, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = {ObjectNotFoundException.class})
    public ResponseEntity<?> handleObjectNotFoundException(ObjectNotFoundException exception, WebRequest webRequest, HttpServletResponse response) {
        response.setStatus(404);

        return formatToResponseEntity(exception.getMessage(), exception.getDeveloperMessage(), webRequest, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {PermissionDeniedException.class})
    public ResponseEntity<?> handlePermissionDenied(PermissionDeniedException exception, WebRequest webRequest) {

        return formatToResponseEntity(exception.getMessage(), exception.getDeveloperMessage(), webRequest, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = {NotSavedException.class})
    public ResponseEntity<?> handleNotSavedException(NotSavedException exception, WebRequest webRequest) {

        return formatToResponseEntity(exception.getMessage(), exception.getDeveloperMessage(), webRequest, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {FileNotFoundException.class})
    public ResponseEntity<?> handleFileNotFoundException(FileNotFoundException exception, WebRequest webRequest, HttpServletResponse response) {
        System.out.print(Arrays.toString(exception.getStackTrace()));
        System.out.print(Arrays.toString(exception.getStackTrace()));
        System.out.print(Arrays.toString(exception.getStackTrace()));
        response.setStatus(400);

        return formatToResponseEntity(exception.getMessage(), Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {BlockException.class})
    public ResponseEntity<?> handleBlockException(BlockException exception, WebRequest webRequest, HttpServletResponse response) {
        response.setStatus(421);

        return formatToResponseEntity(exception.getMessage(), Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.DESTINATION_LOCKED);
    }

    @ExceptionHandler(value = {AlreadyExitsException.class})
    public ResponseEntity<?> handleAlreadyExitsException(AlreadyExitsException exception, WebRequest webRequest, HttpServletResponse response) {
        response.setStatus(400);

        return formatToResponseEntity(exception.getMessage(), Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = {AlreadyTakenException.class})
    public ResponseEntity<?> handleFileNotFoundException(AlreadyTakenException exception, WebRequest webRequest, HttpServletResponse response) {

        return formatToResponseEntity(exception.getMessage(), Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<?> handleBadRequestException(BadRequestException exception, WebRequest webRequest, HttpServletResponse response) {

        return formatToResponseEntity(exception.getMessage(), Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = {HttpClientErrorException.class})
    public ResponseEntity<?> handleHttpClientErrorException(HttpClientErrorException exception, WebRequest webRequest, HttpServletResponse response) {

        return formatToResponseEntity("bad credentials", Arrays.toString(exception.getStackTrace()), webRequest, HttpStatus.NOT_FOUND);
    }

// exception of spring security

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handleInternalAuthenticationServiceException(InternalAuthenticationServiceException exception, WebRequest webRequest) {
//        return new ResponseEntity<>(
//                DataDto.builder()
//                        .success(false)
//                        .error(
//                                new AppErrorDto(HttpStatus.NOT_FOUND,
//                                        "bad credentials",
//                                        Arrays.toString(exception.getStackTrace()),
//                                        webRequest))
//                        .build(), HttpStatus.NOT_FOUND);
//    }


    private ResponseEntity<?> formatToResponseEntity(String message, String developerMessage, WebRequest webRequest, HttpStatus status) {
        return new ResponseEntity<> (
                DataDto.builder()
                        .success(false)
                        .error(
                                new AppErrorDto(status,
                                        message,
                                        developerMessage,
                                        webRequest))
                        .build(), status);
    }
}
