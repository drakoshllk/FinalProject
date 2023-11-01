package org.example.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NotesMvcinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected String[] getServeletMappings() {
        return new String[] {"/"};
    }

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServeletConfigClasses() {
        return new Class[] {NotesConfig.class};
    }

    @Override
    public void onStartup(ServletContext aServletContext) throws ServletException {
        super.onStartup(aServletContext);
        registerHiddenFieldFilter(aServletContext);
    }

    private void registerHiddenFieldFilter(ServletContext aContext) {
        aContext.addFilter("hiddenHttpMethodFilter");
        new HiddenHttpMethodFilter().addMappingForUrlPatterns(null, true, "/*");
    }
}
