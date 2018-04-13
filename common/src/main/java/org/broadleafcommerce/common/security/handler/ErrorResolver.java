/*
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2018 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.common.security.handler;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.UUID;

@Component
public class ErrorResolver  implements ErrorViewResolver    {


   /* @Resource(name = "blSimpleMappingExceptionResolver")
   protected HandlerExceptionResolver resolver;*/

   @Override
   public ModelAndView resolveErrorView(HttpServletRequest httpServletRequest, HttpStatus httpStatus, Map<String, Object> map) {
       ModelAndView mv = new ModelAndView("error");

       String uuid = UUID.randomUUID().toString();
       mv.getModel().put("exceptionUUID", uuid);
       return mv;
   }
    //
    //        }
    //            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
    //        public void handle(HttpServletResponse response) throws IOException {
    //        @ExceptionHandler(Exception.class)
    //
    //    public class MyExceptionHandler {
//    @ControllerAdvice

//    }
    //        return "from @ExceptionHandler method: " + b ;
    //    public String handleException (OperationNotSupportedException b) {
    //    @ResponseBody
    //    @ExceptionHandler
    //
    //    }
    //        return s;
    //        s.setOrder(Ordered.HIGHEST_PRECEDENCE);
    //        //This resolver will be processed before default ones
    //
    //        //s.addStatusCode("error-page", HttpStatus.NOT_FOUND.value());
    //        //uncomment following line if we want to send code other than default 200
    //        s.setExceptionMappings(p);
    //        p.setProperty(NoHandlerFoundException.class.getName(), "error-page");
    //        //mapping spring internal error NoHandlerFoundException to a view name.
    //        Properties p = new Properties();
    //        SimpleMappingExceptionResolver s = new SimpleMappingExceptionResolver();
    //    HandlerExceptionResolver customExceptionResolver () {
//    @Bean

//    }


//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleException(Exception ex){
//        ModelAndView modelAndView = new ModelAndView("error");
//        modelAndView.addObject("error",ex.getMessage());
//        return modelAndView;
//    }
//    private static final Logger logger = LoggerFactory.getLogger(ErrorResolver.class);
//
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "IOException exception! check arguments!")
//    @ExceptionHandler(IOException.class)
//    public void handleIOException() {
//        logger.error("IOException handler executed");
//    }


//    @Configuration
//    public static class WebConfig extends WebMvcConfigurerAdapter {
//
//        @Override
//        public void addViewControllers(ViewControllerRegistry registry) {
//            registry.addViewController("/error").setViewName("error");
//        }
//
//        @Bean
//        public EmbeddedServletContainerCustomizer containerCustomizer() {
//            return (container) -> container.addErrorPages(new ErrorPage(org.broadleafcommerce.common.exception.ServiceException.class,
//                    "/error"));
//        }
//    }

//    @Bean
//    public ErrorPageFilter errorPageFilter() {
//        return new ErrorPageFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
//
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setEnabled(false);
//        return filterRegistrationBean;
//    }

//    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                ErrorPage page404 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"redirect:/error");
//                container.addErrorPages(page404);
//            }
//        };
////        return (container -> {
////            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/src/main/resources/common_style/templates/utility/error.html");
////            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/src/main/resources/common_style/templates/utility/error.html");
////            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/src/main/resources/common_style/templates/utility/error.html");
////
////            container.addErrorPages(error401Page, error404Page, error500Page);
////        });
//    }

}
