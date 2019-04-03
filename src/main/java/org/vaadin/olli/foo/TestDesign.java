package org.vaadin.olli.foo;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the test-design.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-design")
@HtmlImport("test-design.html")
public class TestDesign extends PolymerTemplate<TestDesign.TestDesignModel> {

    /**
     * Creates a new TestDesign.
     */
    public TestDesign() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between TestDesign and test-design.html
     */
    public interface TestDesignModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
